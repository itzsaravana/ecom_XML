package com.comcast.serviceimpl;


import com.comcast.dao.ProductDao;
import com.comcast.service.ProductService;




public class ProductServiceImpl implements ProductService {


    private ProductDao productDao;

    public ProductDao getProductDao() {
        return productDao;
    }

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public String getProduct() {
        return productDao.getProduct();
    }

}
