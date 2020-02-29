package com.geely.entity.admin;

import java.util.Date;

public class ProductColor {
    private Integer colorId;

    private String colorName;

    private String colorImage;

    private Date colorLast;

    public ProductColor(Integer colorId, String colorName, String colorImage, Date colorLast) {
        this.colorId = colorId;
        this.colorName = colorName;
        this.colorImage = colorImage;
        this.colorLast = colorLast;
    }

    public ProductColor() {
        super();
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName == null ? null : colorName.trim();
    }

    public String getColorImage() {
        return colorImage;
    }

    public void setColorImage(String colorImage) {
        this.colorImage = colorImage == null ? null : colorImage.trim();
    }

    public Date getColorLast() {
        return colorLast;
    }

    public void setColorLast(Date colorLast) {
        this.colorLast = colorLast;
    }
}