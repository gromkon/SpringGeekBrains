package Lesson1.Class;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("testServiceName") // по умолчанию имя Компонента - это название класса с маленькой буквы, но можно поменять название, указав его в скобках

/*
    * @Component и @Bean это практически одно и тоже, разница лишь в том, что:
    * аннотация @Component используется в классах, которые создаем мы сами
    * аннотация @Bean используется в классах, которые мы используем внутри AppConfig
*/

public class TestService {

    /*
        * @Value устанавливает значение по умолчанию
        * В данном случае "123" - строка, она автоматически сконвертируется в Integer и установит соответсвующее значение в переменную value
     */
    @Value("123")
    private Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return "Test1";
    }
}
