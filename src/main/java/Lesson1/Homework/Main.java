package Lesson1.Homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CartService cartService1 = context.getBean("cartService", CartService.class);
        cartService1.addProduct(1L);
        cartService1.addProduct(2L);
        cartService1.addProduct(5L);
        System.out.println(cartService1.calcSum());

        CartService cartService2 = context.getBean("cartService", CartService.class);
        System.out.println(cartService2.calcSum());

        CartService cartService3 = context.getBean("cartService", CartService.class);
        cartService3.addProduct(1L);
        cartService3.addProduct(2L);
        cartService3.addProduct(5L);
        cartService3.addProduct(3L);
        cartService3.addProduct(4L);
        cartService3.deleteProduct(3L);
        cartService3.deleteProduct(4L);
        System.out.println(cartService3.calcSum());
    }
}
