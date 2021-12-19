package sh.antisla.grm.heatmanager.application.rest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@WebMvcTest(TestController::class)
internal class TestControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `devrait revoyer ok`() {
        // Given/When/Then
        mockMvc
                .perform(MockMvcRequestBuilders.get("/api/v1/test"))
                .andExpect(MockMvcResultMatchers.status().isOk)
                .andExpect(
                        MockMvcResultMatchers.content().string("ok"))

    }
}