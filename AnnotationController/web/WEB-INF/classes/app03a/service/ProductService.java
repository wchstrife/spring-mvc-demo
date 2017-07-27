package app03a.service;

import app03a.domain.Product;

/**
 * Created by wangchenghao on 2017/7/23.
 */
public interface ProductService {
    Product add(Product product);
    Product get(long id);
}
