package Lesson1.Homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
    }

    @PostConstruct
    public void init() {
        productList.add(new Product(1L, "apple", 50.0));
        productList.add(new Product(2L, "lemon", 12.5));
        productList.add(new Product(3L, "orange", 172.3));
        productList.add(new Product(4L, "banana", 42.1));
        productList.add(new Product(5L, "potato", 123.99));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(productList);
    }

    public Product findProduct(long id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        throw new RuntimeException("No product with id = " + id);
    }


}
