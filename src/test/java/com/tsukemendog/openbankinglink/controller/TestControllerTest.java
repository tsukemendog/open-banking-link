package com.tsukemendog.openbankinglink.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;

import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;



import static com.tsukemendog.openbankinglink.ApiDocumentUtils.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.request.RequestDocumentation.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;

@WebMvcTest(TestController.class)
@AutoConfigureRestDocs(uriScheme = "http", uriHost = "docs.api-skyclass.com")
public class TestControllerTest {

    @Autowired
    MockMvc mockMvc;

/*    @BeforeEach
    void setup() { //text/html;charset=UTF-8
        this.mockMvc = MockMvcBuilders.standaloneSetup(new TestController())
                .defaultRequest(get("/").accept(MediaType.TEXT_HTML).param("testId","ㅋㅋㅋ"))
                .alwaysExpect(status().isOk())
                .build();
    }*/
    @Test
    void test() throws Exception {
        this.mockMvc.perform(RestDocumentationRequestBuilders.get("/tt")
                        .contentType(MediaType.TEXT_HTML).accept(MediaType.TEXT_HTML)).andDo(document("test", // (4)
                getDocumentRequest(),
                getDocumentResponse(),
                requestParameters(
                        parameterWithName("testId").description("아이디")
                )
                /*responseFields(
                        fieldWithPath("code").type(JsonFieldType.STRING).description("결과코드")
                )*/
        ));;
    }

}
