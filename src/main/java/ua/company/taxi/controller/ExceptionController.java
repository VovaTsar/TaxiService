package ua.company.taxi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController implements ErrorController {
    @RequestMapping("/error")
    public String handleError() {
        return "errorSpring";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}

