package com.power.br.service;

import com.power.br.dao.ProductServiceDao;
import com.power.br.pojo.ProductServicePOJO;

import java.util.List;

/**
 * Created by wanggang on 2016/10/5.
 */
public interface ProductServiceService {
    List<ProductServicePOJO> query(Integer status);
    void add(ProductServicePOJO pojo);
}
