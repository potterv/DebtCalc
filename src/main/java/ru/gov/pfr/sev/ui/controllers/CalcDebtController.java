package ru.gov.pfr.sev.ui.controllers;

import com.fasterxml.jackson.databind.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gov.pfr.sev.calculate.Calc;

@Controller
public class CalcDebtController {

@GetMapping("/index")
    public String index(Model model){
        Calc calc = new Calc();
        model.addAttribute("calc",calc);
        model.addAttribute("resulSumm", calc.resultSumm());
    return "index";
}
@PostMapping("/index")
    public String calc(Calc calc,BindingResult result, Model model){


    return "index";
}
}
