package ru.gov.pfr.sev.service;

import org.springframework.stereotype.Service;
import ru.gov.pfr.sev.calculate.Calc;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class MethodsCalculateService {

    public double result(Calc calc){

        double value = (calc.getSumm()/calc.getColDasInMonthPol())*calc.getColDaysInMonth()+(calc.getSumm()*calc.getColPolMonth());
        BigDecimal result =  new BigDecimal(value);
        result = result.setScale(2, RoundingMode.HALF_UP);
//        logger.info("Получен результат: " + calc.result.doubleValue());
        return result.doubleValue();
    }
}
