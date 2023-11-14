package com.tsukemendog.openbankinglink.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/tt")
    public ResponseEntity<String> test1(@RequestParam String testId) {
        System.out.println("id : " + testId);

        return new ResponseEntity<>(
                "www",  HttpStatus.OK);
    }

    @GetMapping("/ttt")
    public ResponseEntity<String> test(@RequestParam String testId) {
        System.out.println("testId : " + testId);
        if ("no".equals(testId)) {
            return new ResponseEntity<>("Error", HttpStatus.BAD_GATEWAY);
        }

        return new ResponseEntity<>(
                "Custom header set",  HttpStatus.OK);
    }


}
