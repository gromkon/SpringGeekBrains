package Lesson;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    *Отличие Service от Repository состоит в том, что
    *Service отвечает за бизнес-логику
    *Repository отвечает за поставку данных (запросы из БД и т.п.)
 */

@Component
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {

    }

    @PostConstruct // Данный код выполнится после инициализации
    public void init() {
        productList.add(new Product(1L, "apple", 50.0));
        productList.add(new Product(2L, "lemon", 12.5));
        productList.add(new Product(3L, "orange", 72.3));
    }

    public List<Product> findAll() {
        return Collections.unmodifiableList(productList);
    }

    public void addProduct(Product product) {
        productList.add(product);
    }
}
