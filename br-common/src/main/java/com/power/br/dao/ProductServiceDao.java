package com.power.br.dao;

import com.power.br.pojo.ProductServicePOJO;

import java.util.List;

/**
 * Created by wanggang on 2016/10/5.
 */
public interface ProductServiceDao {
    List<ProductServicePOJO> query(Integer status);
    void add(ProductServicePOJO pojo);
}
