package com.tsukemendog.openbankinglink.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/ttt")
    public ResponseEntity<String> test(@RequestParam String testId) {
        System.out.println("testId : " + testId);
        return new ResponseEntity<>(
                "Custom header set",  HttpStatus.OK);
    }


}
