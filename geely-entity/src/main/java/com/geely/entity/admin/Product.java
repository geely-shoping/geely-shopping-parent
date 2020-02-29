package com.geely.entity.admin;

import java.util.Date;

public class Product {
    private Integer productId;

    private String productName;

    private Long productPrice;

    private String productImage;

    private String productDescribe;

    private String productStatus;

    private Date productCreate;

    private Date productLast;

    public Product(Integer productId, String productName, Long productPrice, String productImage, String productDescribe, String productStatus, Date productCreate, Date productLast) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImage = productImage;
        this.productDescribe = productDescribe;
        this.productStatus = productStatus;
        this.productCreate = productCreate;
        this.productLast = productLast;
    }

    public Product() {
        super();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Long productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage == null ? null : productImage.trim();
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe == null ? null : productDescribe.trim();
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus == null ? null : productStatus.trim();
    }

    public Date getProductCreate() {
        return productCreate;
    }

    public void setProductCreate(Date productCreate) {
        this.productCreate = productCreate;
    }

    public Date getProductLast() {
        return productLast;
    }

    public void setProductLast(Date productLast) {
        this.productLast = productLast;
    }
}