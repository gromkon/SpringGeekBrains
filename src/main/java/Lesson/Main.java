package Lesson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

//        // 1 часть урока
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
////        TestService testService = context.getBean("testServiceTHIS_IS_NAME", TestService.class);
//        TestService testService = context.getBean("testServiceName", TestService.class);
//        System.out.println(testService.getName());

        // 2 часть урока
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        TestService testService = context.getBean("testServiceTHIS_IS_NAME", TestService.class);
//        System.out.println(testService.getValue());
        ProductService defaultProductService = context.getBean("productService", ProductService.class);
        System.out.println(defaultProductService.getProductList());


    }

}
