package ru.gov.pfr.sev.calculate;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calc {
    private double summ;
    private  int colDaysInMonth;
    private int colDasInMonthPol;
    private int colPolMonth;

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
    }

    public void setColDaysInMonth(int colDaysInMonth) {
        this.colDaysInMonth = colDaysInMonth;

    }

    public void setColPolMonth(int colPolMonth) {
        this.colPolMonth = colPolMonth;
    }

    public int getColDasInMonthPol() {
        return colDasInMonthPol;
    }

    public void setColDasInMonthPol(int colDasInMonthPol) {
        this.colDasInMonthPol = colDasInMonthPol;
    }
/*
    ћетод выполн€ет расчет суммы по формуле
       результат = (сумма * количество полных дней в мес€це * на количество не полных дней в мес€це)
                 + (сумма * количество полных мес€цев)
     с округлением до двух знаков после зап€той
*/
    public double resultSumm(){
        double value = (this.summ/this.colDasInMonthPol)*this.getColDaysInMonth()+(this.summ*this.colPolMonth);
        this.result =  new BigDecimal(value);
        this.result = result.setScale(2, RoundingMode.HALF_UP);
        return this.result.doubleValue();
    }

}
