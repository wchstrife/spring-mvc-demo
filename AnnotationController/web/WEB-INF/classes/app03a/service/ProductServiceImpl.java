package app03a.service;

import app03a.domain.Product;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by wangchenghao on 2017/7/23.
 */
@Service
public class ProductServiceImpl implements ProductService{

    private Map<Long, Product> products = new HashMap<Long, Product>();
    private AtomicLong generatro = new AtomicLong();

    public ProductServiceImpl(){
        Product product = new Product();
        product.setName("JX1 Power Drill");
        product.setDescription("Powerful hand drill, made to perfection");
        product.setPrice(12.99F);
        add(product);
    }

    @Override
    public Product add(Product product) {
        long newId = generatro.incrementAndGet();
        product.setId(newId);
        products.put(newId, product);

        return product;
    }

    @Override
    public Product get(long id) {

        return products.get(id);
    }
}
