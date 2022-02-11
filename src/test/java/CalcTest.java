import calculate.Calc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc;
    @BeforeEach
    public void setUp() {
        calc = new Calc();
        calc.setSumm(7082.85);
        calc.setColPolMonth(3);
        calc.setColDaysInMonth(17);
        calc.setColDasInMonthPol(31);

    }

    @Test
    void setSumm() {
        calc.setSumm(7082.85);
        assertEquals(calc.getSumm(),7082.85);
    }

    @Test
    void setColDaysInMonth() {
        calc.setColDaysInMonth(17);
        assertEquals(calc.getColDaysInMonth(),17);
    }

    @Test
    void setColPolMonth() {
        calc.setColPolMonth(3);
        assertEquals(calc.getColPolMonth(),3);
    }

    @Test
    void result() {
       assertEquals(calc.resultSumm(),25132.69,0.01);
    }

    @Test
    void setColDasInMonthPol() {
        calc.setColDasInMonthPol(31);
        assertEquals(calc.getColDasInMonthPol(),31);
    }
}