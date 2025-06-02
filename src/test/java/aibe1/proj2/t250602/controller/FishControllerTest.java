package aibe1.proj2.t250602.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(FishController.class)
public class FishControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("GET /fish -> 200")
    void getFishListOK() throws Exception {
        mvc.perform(get("/fish"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET /fishy -> 404")
    void getFishyNotFound() throws Exception {
        mvc.perform(get("/fishy"))
                .andExpect(status().isNotFound());
    }

}
