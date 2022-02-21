package ru.gov.pfr.sev.calculate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;

public class Calc {
    private double summ;
    private  int colDaysInMonth;
    private int colDaysInMonthPol;
    private int colPolMonth;
    private DateCakcImpements dateCalc = new DateCakcImpements();
    private LocalDate startDate, endDate;
    private Period period;

    public void setDateStartEnd() {

        period = Period.between(startDate, endDate);
        this.colPolMonth = period.getMonths();

        this.colDaysInMonthPol = startDate.lengthOfMonth();

        this.colDaysInMonth =this.colDaysInMonthPol-(startDate.getDayOfMonth()-1);

    }

    private static final Logger logger = LogManager.getLogger(Calc.class);

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getSumm() {
        return summ;
    }

    public int getColDaysInMonth() {
        return colDaysInMonth;
    }

    public int getColPolMonth() {
        return colPolMonth;
    }

    private BigDecimal result;

    public void setSumm(double summ) {

        this.summ = summ;
        logger.info("Вы ввели сумму: " + summ);
    }

    public void setColDaysInMonth(int colDaysInMonth) {

        this.colDaysInMonth = colDaysInMonth;
        logger.info("Количество дней в месяце " + colDaysInMonth);
    }

    public void setColPolMonth(int colPolMonth) {
        this.colPolMonth = colPolMonth;
        logger.info("Количество полных месяцев " + colPolMonth);
    }

    public int getColDasInMonthPol() {
        return colDaysInMonthPol;
    }

    public void setColDasInMonthPol(int colDaysInMonthPol) {

        this.colDaysInMonthPol = colDaysInMonthPol;
        logger.info("Количество полных дней в месяце " + colDaysInMonthPol);
    }
/*
    ����� ��������� ������ ����� �� �������
       ��������� = (����� * ���������� ������ ���� � ������ * �� ���������� �� ������ ���� � ������)
                 + (����� * ���������� ������ �������)
     � ����������� �� ���� ������ ����� �������
*/
    public double resultSumm(){
        double value = (this.summ/this.colDaysInMonthPol)*this.getColDaysInMonth()+(this.summ*this.colPolMonth);
        this.result =  new BigDecimal(value);
        this.result = result.setScale(2, RoundingMode.HALF_UP);
        logger.info("Получен результат: " + this.result.doubleValue());
        return this.result.doubleValue();
    }


}
