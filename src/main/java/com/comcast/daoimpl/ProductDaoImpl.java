package com.comcast.daoimpl;


import com.comcast.bean.Product;
import com.comcast.entity.ProductEntity;
import com.comcast.dao.ProductDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public String getProduct() {
        saveProduct();
        Session currentSession = sessionFactory.getCurrentSession();
        ProductEntity productEntity = currentSession.get(ProductEntity.class, 1);
        Product product = new Product();
        product.setProductName(productEntity.getProductName());
        System.out.println("<-----ProductName---->"+product.getProductName());
        return product.getProductName();
    }



    public void saveProduct() {
        Session currentSession = sessionFactory.getCurrentSession();
        ProductEntity saveProductEntity =new ProductEntity();
        saveProductEntity.setProductName("Test Product yy");
        saveProductEntity.setQuantity(5);
        saveProductEntity.setPrice(5.0);
        currentSession.update(saveProductEntity);
        System.out.println("<-----saved---->");
    }


}
