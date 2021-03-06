package ru.gov.pfr.sev.calculate;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc;
    @BeforeEach
    public void setUp() {
        calc = new Calc();
        calc.setSumm(7082.85);
        calc.setStartDate(LocalDate.parse("2021-10-15"));
        calc.setEndDate(LocalDate.parse("2022-01-31"));
        calc.setDateStartEnd();
//        calc.setColPolMonth(3);
//        calc.setColDaysInMonth(17);
//        calc.setColDasInMonthPol(31);


    }

    @Test
    void setSumm() {
        calc.setSumm(7082.85);
        assertEquals(calc.getSumm(),7082.85);

    }

    @Test
    void setColDaysInMonth() {
        calc.setColDaysInStartMonth(17);
        assertEquals(calc.getColDaysInStartMonth(),17);
    }

    @Test
    void setColPolMonth() {
        calc.setColPolMonth(3);
        assertEquals(calc.getColPolMonth(),3);
    }

    @Test
    void result() {
       assertEquals(calc.resultSumm(),25132.69);
    }

    @Test
    void setColDasInMonthPol() {
        calc.setColDasInMonthPol(31);
        assertEquals(calc.getColDaysInStartMonthPol(),31);
    }
    @Test
    public void date_(){
        assertEquals(calc.getColPolMonth(),3);
        assertEquals(calc.getColDaysInStartMonth(),17);
        assertEquals(calc.getColDaysInEndMonth(),0);
        assertEquals(calc.getColDaysInStartMonthPol(),31);
        assertEquals(calc.getColDaysInEndMonthPol(),0);


    }
}