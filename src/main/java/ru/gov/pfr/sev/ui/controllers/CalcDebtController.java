package ru.gov.pfr.sev.ui.controllers;

import com.fasterxml.jackson.databind.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gov.pfr.sev.calculate.Calc;

import ru.gov.pfr.sev.service.MethodsCalculateService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
public class CalcDebtController {


    @Autowired
    private MethodsCalculateService methodsCalculateService;

    @GetMapping("/index")
    @PostMapping("/index")
    public String index(@RequestParam("summ") double summ, @RequestParam("dateStart") String startDate,@RequestParam("dateEnd") String endDate,Model model) {
        Calc calc = new Calc();
        calc.setSumm(summ);
        calc.setStartDate(LocalDate.parse(startDate));
        calc.setEndDate(LocalDate.parse(endDate));
        calc.setDateStartEnd();
        model.addAttribute("rezult", calc.resultSumm());
        return "/index";
    }
}
