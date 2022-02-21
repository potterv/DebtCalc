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
import ru.gov.pfr.sev.calculate.Calc;

import ru.gov.pfr.sev.service.MethodsCalculateService;



@Controller
public class CalcDebtController {
     Calc calc = new Calc();

    @Autowired
    private MethodsCalculateService methodsCalculateService;

    @GetMapping("/index")
    public String index(Model model) {


//        calc.setSumm(7082.85);
//        calc.setStartDate(LocalDate.parse("2021-10-15"));
//        calc.setEndDate(LocalDate.parse("2022-01-31"));
//        calc.setDateStartEnd();
        model.addAttribute("calc", calc);
        return "index";
    }

//    @PostMapping("/index")
//    public String calc(@ModelAttribute("calc")  Calc calc, Model model) {
//
//        model.addAttribute("calc", calc.resultSumm(calc));
//        return "redirect:/index";
//    }
}
