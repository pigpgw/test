package com.example.springstudy.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
@Import(HelloService.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void name을_받아_인사한다() throws Exception {
        mockMvc.perform(get("/hello").param("name", "건우"))
                .andExpect(status().isOk())
                .andExpect(content().string("안녕하세요, 건우!"));
    }

    @Test
    void name이_없으면_Spring으로_인사한다() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("안녕하세요, Spring!"));
    }
}
