package ru.gov.pfr.sev.calculate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calc {
    private double summ;
    private  int colDaysInMonth;
    private int colDasInMonthPol;
    private int colPolMonth;
    private static final Logger logger = LogManager.getLogger(Calc.class);
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
        logger.info("������� �����: " + summ);
    }

    public void setColDaysInMonth(int colDaysInMonth) {

        this.colDaysInMonth = colDaysInMonth;
        logger.info("������� ���������� ���� � ������ " + colDaysInMonth);
    }

    public void setColPolMonth(int colPolMonth) {
        this.colPolMonth = colPolMonth;
        logger.info("������� ���������� ������ ������� " + colPolMonth);
    }

    public int getColDasInMonthPol() {
        return colDasInMonthPol;
    }

    public void setColDasInMonthPol(int colDaysInMonthPol) {

        this.colDasInMonthPol = colDaysInMonthPol;
        logger.info("������� ���������� ������ ���� � ������ " + colDaysInMonthPol);
    }
/*
    ����� ��������� ������ ����� �� �������
       ��������� = (����� * ���������� ������ ���� � ������ * �� ���������� �� ������ ���� � ������)
                 + (����� * ���������� ������ �������)
     � ����������� �� ���� ������ ����� �������
*/
    public double resultSumm(){
        double value = (this.summ/this.colDasInMonthPol)*this.getColDaysInMonth()+(this.summ*this.colPolMonth);
        this.result =  new BigDecimal(value);
        this.result = result.setScale(2, RoundingMode.HALF_UP);
        logger.info("������� ���������: " + this.result.doubleValue());
        return this.result.doubleValue();
    }

}
