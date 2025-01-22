import com.jamfschool.Application
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@AutoConfigureMockMvc
@SpringBootTest(classes = [Application::class])
class ExampleControllerTest {
     @Autowired
     private lateinit var mockMvc: MockMvc

     @Test
     fun `should return default message`() {
         mockMvc.get("/test?testMap[operator]=<&testMap[value]=12345") {
         }.andExpect {
             status { isOk() }
             content { string("FilterExample(testMap={operator=[<], value=[12345]})") }
         }
     }
}