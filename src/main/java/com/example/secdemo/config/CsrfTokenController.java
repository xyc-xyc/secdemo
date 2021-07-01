package com.example.secdemo.config;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.security.PermitAll;
import java.util.HashMap;

@Controller
public class CsrfTokenController {
    @RequestMapping("/t1")
    public String index() {
        return "page";
    }
}


