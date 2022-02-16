package ru.gov.pfr.sev;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.gov.pfr.sev.calculate.Calc;
import ru.gov.pfr.sev.ui.console.InDataCalc;

public class CalcDebtConsole {
    private static final Logger logger = LogManager.getLogger(CalcDebtConsole.class);
    public static void main(String[] args) {
        logger.info("Начат расчет");
        Calc calc =new Calc();
        InDataCalc inDataCalc = new InDataCalc();
        boolean count = true;
        while (count) {
            try {
                calc.setSumm(inDataCalc.getSumm());
                calc.setColDasInMonthPol(inDataCalc.getColDasInMonthPol());
                calc.setColDaysInMonth(inDataCalc.getColDaysInMonth());
                calc.setColPolMonth(inDataCalc.getColPolMonth());

            } catch (NumberFormatException e) {
                e.printStackTrace();
                logger.warn("Некорректный формат ввода параметра");
                logger.error(e.getMessage());
                System.out.println("posledniy vvedennyi parametr ne korreknyi");
            } finally {

               try {
                   System.out.print(" REZULTAT : " + calc.resultSumm());
               }catch (NumberFormatException nfe){
                   nfe.getMessage();
                   System.out.print(" Odin iz parametrov ne korekten" );
               }
                System.out.println("");
                if (!inDataCalc.isCount()){
                    logger.info("Расчет завершен");
                    break;
                }
            }

        }
    }
}
