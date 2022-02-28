package ru.gov.pfr.sev.ui.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gov.pfr.sev.calculate.Calc;

import ru.gov.pfr.sev.service.MethodsCalculateService;

import java.time.LocalDate;


@Controller
public class CalcDebtController {

    private Calc calc;
    @Autowired
    private MethodsCalculateService methodsCalculateService;

    @GetMapping("/index")
    @PostMapping("/index")
    public String index(@RequestParam("summ") double summ, @RequestParam("dateStart") String startDate,@RequestParam("dateEnd") String endDate,Model model) {
        calc = new Calc();
        calc.setSumm(summ);
        calc.setStartDate(LocalDate.parse(startDate));
        calc.setEndDate(LocalDate.parse(endDate));
        calc.setDateStartEnd();
        model.addAttribute("summ", calc.getSumm());
        model.addAttribute("dateStart", calc.getStartDate() );
        model.addAttribute("dateEnd", calc.getEndDate());

        model.addAttribute("getColDaysInStartMonth", calc.getColDaysInStartMonth());
        model.addAttribute("getColDaysInStartMonthPol", calc.getColDaysInStartMonthPol());
        model.addAttribute("getColDaysInEndMonth", calc.getColDaysInEndMonth());
        model.addAttribute("getColDaysInEndMonthPol", calc.getColDaysInEndMonthPol());
        model.addAttribute("ColPolMonth", calc.getColPolMonth());

        model.addAttribute("rezult", calc.resultSumm());
        return "index";
    }
}
