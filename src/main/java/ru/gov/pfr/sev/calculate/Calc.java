package ru.gov.pfr.sev.calculate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Calc {
    private double summ;
    private int colDaysInStartMonth,colDaysInEndMonth;
    private int colDaysInStartMonthPol,colDaysInEndMonthPol;
    private int colPolMonth;
    private DateCakcImpements dateCalc = new DateCakcImpements();
    private LocalDate startDate, endDate;
    private Period period;

    private static final Logger logger = LogManager.getLogger(Calc.class);

    public void setDateStartEnd() {

        this.period = Period.between(startDate, endDate);
        this.colPolMonth = this.period.getMonths();

        this.colDaysInStartMonthPol = this.startDate.lengthOfMonth();

        if (this.colPolMonth == 0) {
            this.colDaysInStartMonth = this.endDate.getDayOfMonth() - (this.startDate.getDayOfMonth() - 1);
            this.colDaysInEndMonth=0;
            this.colDaysInEndMonthPol = 0;
        } else {
            this.colDaysInStartMonth = this.colDaysInStartMonthPol - (this.startDate.getDayOfMonth() - 1);
            if (this.endDate.getDayOfMonth()!=this.endDate.lengthOfMonth()){
                this.colDaysInEndMonth =this.endDate.getDayOfMonth();
                this.colPolMonth--;
                this.colDaysInEndMonthPol = this.endDate.lengthOfMonth();

            }else {
                this.colDaysInEndMonth=0;
                this.colDaysInEndMonthPol = 0;
            }
        }
        logger.info("Количество дней выплаты в начальном месяце: " + this.colDaysInStartMonth);
        logger.info("Количество полных дней в начальном месяце: " + this.colDaysInStartMonthPol);
        logger.info("Количество дней выплаты в конечном месяце: " + this.colDaysInEndMonth);
        logger.info("Количество полных дней в конечном месяце: " + this.colDaysInEndMonthPol);
        logger.info("Количество полных месяцев: " + this.colPolMonth);
    }


    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
        logger.info("Вы ввели дату начала выплаты: " + this.startDate);
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
        logger.info("Вы ввели дату окончания выплаты: " + this.endDate);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getSumm() {
        return summ;
    }

    public int getColDaysInStartMonth() {
        return colDaysInStartMonth;
    }

    public int getColDaysInEndMonth() {
        return colDaysInEndMonth;
    }

    public int getColPolMonth() {
        return colPolMonth;
    }

    private BigDecimal result;

    public void setSumm(double summ) {

        this.summ = summ;
        logger.info("Вы ввели сумму: " + summ);
    }

    public void setColDaysInStartMonth(int colDaysInStartMonth) {

        this.colDaysInStartMonth = colDaysInStartMonth;
        logger.info("Количество дней в месяце " + colDaysInStartMonth);
    }

    public int getColDaysInEndMonthPol() {
        return colDaysInEndMonthPol;
    }

    public void setColPolMonth(int colPolMonth) {
        this.colPolMonth = colPolMonth;
        logger.info("Количество полных месяцев " + colPolMonth);
    }

    public int getColDaysInStartMonthPol() {
        return colDaysInStartMonthPol;
    }

    public void setColDasInMonthPol(int colDaysInMonthPol) {

        this.colDaysInStartMonthPol = colDaysInMonthPol;
        logger.info("Количество полных дней в месяце " + colDaysInMonthPol);
    }

    /*
        ����� ��������� ������ ����� �� �������
           ��������� = (����� * ���������� ������ ���� � ������ * �� ���������� �� ������ ���� � ������)
                     + (����� * ���������� ������ �������)
         � ����������� �� ���� ������ ����� �������
    */
    public double resultSumm() {
        double value = (this.summ / (this.colDaysInStartMonthPol+this.colDaysInEndMonthPol) * (this.getColDaysInStartMonth()+this.colDaysInEndMonth)) + (this.summ * this.colPolMonth);
        this.result = new BigDecimal(value);
        this.result = result.setScale(2, RoundingMode.HALF_UP);
        logger.info("Получен результат: " + this.result.doubleValue());
        return this.result.doubleValue();
    }


}
