package com.geely.entity.admin;

import java.util.Date;

public class ProductCategory {
    private Integer categoryId;

    private String categoryName;

    private Integer categoryParent;

    private String categoryStatus;

    private String categoryDescribe;

    private Date categoryLast;

    public ProductCategory(Integer categoryId, String categoryName, Integer categoryParent, String categoryStatus, String categoryDescribe, Date categoryLast) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryParent = categoryParent;
        this.categoryStatus = categoryStatus;
        this.categoryDescribe = categoryDescribe;
        this.categoryLast = categoryLast;
    }

    public ProductCategory() {
        super();
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategoryParent() {
        return categoryParent;
    }

    public void setCategoryParent(Integer categoryParent) {
        this.categoryParent = categoryParent;
    }

    public String getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(String categoryStatus) {
        this.categoryStatus = categoryStatus == null ? null : categoryStatus.trim();
    }

    public String getCategoryDescribe() {
        return categoryDescribe;
    }

    public void setCategoryDescribe(String categoryDescribe) {
        this.categoryDescribe = categoryDescribe == null ? null : categoryDescribe.trim();
    }

    public Date getCategoryLast() {
        return categoryLast;
    }

    public void setCategoryLast(Date categoryLast) {
        this.categoryLast = categoryLast;
    }
}