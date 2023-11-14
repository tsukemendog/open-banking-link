package com.tsukemendog.openbankinglink.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class TestControllerTest {
    MockMvc mockMvc;

    @BeforeEach
    void setup() { //text/html;charset=UTF-8
        this.mockMvc = MockMvcBuilders.standaloneSetup(new TestController())
                .defaultRequest(get("/ttt").accept(MediaType.TEXT_HTML).param("testId","ㅋㅋㅋ"))
                .alwaysExpect(status().isOk())
                .build();
    }
    @Test
    void test() throws Exception {
        mockMvc.perform(get("/ttt?testId={thing}", "ㅈㅈㅈ"));
    }

}
