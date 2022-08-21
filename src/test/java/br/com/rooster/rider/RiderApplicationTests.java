package br.com.rooster.rider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class RiderApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    void getRiders() throws Exception {

        mvc.perform(MockMvcRequestBuilders
                .get("/riders")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
