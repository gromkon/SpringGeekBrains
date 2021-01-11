package Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/*
    * Отличие Service от Repository состоит в том, что
    * Service отвечает за бизнес-логику и включает в себя Repository
    * Repository отвечает за поставку данных (запросы из БД и т.п.)
 */

@Component("productService")
//@Scope("singleton") // * singleton - дефолтное значние данного параметра, это значит, что создастся всего один объект данного класа
//                    // * prototype - на каждый вызов создания класса, будет создаваться новый объект класса
public class DefaultProductService implements ProductService {

// *  @Autowired //  Внедрение завимости через @Autowired (1 вариант из 3)
// !   // Не рекомендуется разработчиками
    private ProductRepository productRepository;

//  *  // Внедрение зависимости через конструктор (2 вариант из 3)
//  !  // Не желательно, т.к. при взаимном использовании компанентами друг друга они не смогут инициализироваться
//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;ccx
//    }

    // * Внедрение зависимости через setter и @Autowired (3 вариант из 3)
    // ! Самый лучший вариант
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProductList() {
        return productRepository.findAll();
    }
}
