package cn.itcast.service.impl;

import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;


    //添加产品


    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }

    //查询所有产品
    @Override
    public List<Product> findAll() throws Exception {

        return productDao.findAll();
    }
}
