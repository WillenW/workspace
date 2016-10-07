package com.power.br.service.imp;

import com.power.br.dao.ProductServiceDao;
import com.power.br.pojo.ProductServicePOJO;
import com.power.br.service.ProductServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductServiceService")
public class ProductServiceServiceImp implements ProductServiceService {
    @Autowired
    private ProductServiceDao productServiceDao;
    @Override
    public List<ProductServicePOJO> query(Integer status) {
        return productServiceDao.query(status);
    }

    @Override
    public void add(ProductServicePOJO pojo) {
        productServiceDao.add(pojo);
    }
}
