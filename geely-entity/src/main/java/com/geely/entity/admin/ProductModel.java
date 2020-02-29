package com.geely.entity.admin;

import java.util.Date;

public class ProductModel {
    private Integer modelId;

    private String modelName;

    private Long modelPrice;

    private String modelDescribe;

    private Date modelLast;

    public ProductModel(Integer modelId, String modelName, Long modelPrice, String modelDescribe, Date modelLast) {
        this.modelId = modelId;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
        this.modelDescribe = modelDescribe;
        this.modelLast = modelLast;
    }

    public ProductModel() {
        super();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Long getModelPrice() {
        return modelPrice;
    }

    public void setModelPrice(Long modelPrice) {
        this.modelPrice = modelPrice;
    }

    public String getModelDescribe() {
        return modelDescribe;
    }

    public void setModelDescribe(String modelDescribe) {
        this.modelDescribe = modelDescribe == null ? null : modelDescribe.trim();
    }

    public Date getModelLast() {
        return modelLast;
    }

    public void setModelLast(Date modelLast) {
        this.modelLast = modelLast;
    }
}