package com.example.secdemo.config;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;
import java.util.HashMap;

@RestController
public class RestApi {
    @PermitAll
    @PostMapping(value = "/t", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Object p() {
        System.out.println("\n\n\nPOST\n");
        return new HashMap<String, String>();
    }
}
