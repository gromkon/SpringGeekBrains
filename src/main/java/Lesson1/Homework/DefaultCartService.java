package Lesson1.Homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("cartService")
@Scope("prototype")
public class DefaultCartService implements CartService {

    private ProductRepository productRepository;
    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Long id) {
        products.add(productRepository.findProduct(id));
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findProduct(id);
        products.remove(product);
    }

    @Override
    public double calcSum() {
        double sum = 0.0;
        for (Product product: products) {
            sum += product.getPrice();
        }
        return sum;
    }

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
