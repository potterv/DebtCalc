package ru.gov.pfr.sev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gov.pfr.sev.calculate.Calc;
import ru.gov.pfr.sev.ui.console.InDataCalc;

public class CalcDebtConsole {
    private static final Logger logger = LogManager.getLogger(CalcDebtConsole.class);
    public static void main(String[] args) {
        logger.info("Начало");
        Calc calc ;
        InDataCalc inDataCalc ;
        boolean count = true;
        while (count) {
            calc =new Calc();
             inDataCalc = new InDataCalc();
            try {
                inDataCalc.setDateStartEnd();
                calc.setSumm(inDataCalc.getSumm());
                calc.setColDasInMonthPol(inDataCalc.getColDaysInMonthPol());
                calc.setColDaysInMonth(inDataCalc.getColDaysInMonth());
                calc.setColPolMonth(inDataCalc.getColPolMonth());
                System.out.print(" Результат : " + calc.resultSumm());

            } catch (NumberFormatException e) {
                e.printStackTrace();
                logger.warn("Некорректны параметр");
                logger.error(e.getMessage());
                System.out.println("Последний введенный параметр некорректен");
            } finally {
                System.out.println("");
                if (!inDataCalc.isCount()){
                    logger.info("Завершено");
                    break;
                }

            }


        }
    }
}
