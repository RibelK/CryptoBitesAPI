package criptobites.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HealthcheckController {

    @GetMapping
    @ResponseBody
    private String check() {
        return "OK";
    }

}
