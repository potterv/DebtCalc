package ru.gov.pfr.sev.ui.controllers;

import com.fasterxml.jackson.databind.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gov.pfr.sev.calculate.Calc;

@Controller
public class CalcDebtController {

@GetMapping("/index")
    public String index(Model model){

    return "index";
}
@PostMapping("/index")
    public String calc(Model model){
    Calc calc = new Calc();
    calc.setSumm(2323.23);
    model.addAttribute("calc", calc);
    model.addAttribute("summ",calc.getSumm());
    return "redirect:/index";
}
}
