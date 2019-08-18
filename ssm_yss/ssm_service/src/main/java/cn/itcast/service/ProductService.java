package cn.itcast.service;

import cn.itcast.domain.Product;

import java.util.List;

public interface ProductService {
    //查询所有产品
    public List<Product> findAll() throws Exception;

    //添加产品
    void save(Product product) throws Exception;
}
