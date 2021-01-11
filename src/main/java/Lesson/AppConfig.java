package Lesson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"Lesson1.Lesson"})
public class AppConfig {

    /*
        * @Component и @Bean это практически одно и тоже, разница лишь в том, что:
        * аннотация @Component используется в классах, которые создаем мы сами
        * аннотация @Bean используется в классах, которые мы используем внутри AppConfig
    */

    @Bean
    public TestService testServiceTHIS_IS_NAME() {
        TestService testService = new TestService();
        return testService;
    }


}
