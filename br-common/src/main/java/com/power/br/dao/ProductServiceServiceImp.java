package com.power.br.dao;

import com.power.br.pojo.ProductServicePOJO;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanggang on 2016/10/5.
 */
@Service("ProductServiceDao")
public class ProductServiceServiceImp implements ProductServiceDao{
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    @Override
    public List<ProductServicePOJO> query(Integer status) {
        String hql = "select * from br_product_service where status ="+status;
        Query query= sessionFactory.getCurrentSession().createSQLQuery(hql);
        query.setResultTransformer(Transformers.aliasToBean(ProductServicePOJO.class));
        return query.list();
    }

    @Override
    public void add(ProductServicePOJO pojo) {
        String sql ="INSERT INTO br_product_service(title,content)VALUES ('"+pojo.getTitle()+"','"+pojo.getContent()+"')";
        Query query = sessionFactory.getCurrentSession().createSQLQuery(sql);
        query.executeUpdate();
    }
}
