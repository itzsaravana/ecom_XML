package com.comcast.bean;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Product {
    private Integer productId;     
    private Integer  quantity;
    private String  productName;
    private Double price;
}
