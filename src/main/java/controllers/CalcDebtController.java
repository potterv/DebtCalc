package controllers;

import calculate.Calc;
import com.fasterxml.jackson.databind.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcDebtController {

@GetMapping("/index")
    public String index(Model model){

    return "index";
}
@PostMapping("/calc")
    public String calc(Model model){

    return "calc";
}
}
