package com.geely.entity.admin;

import java.util.Date;

public class ProductImage {
    private Integer imageId;

    private String imageName;

    private String imageMaster;

    private String imageStatus;

    private String imageDescribe;

    private Date imageLast;

    public ProductImage(Integer imageId, String imageName, String imageMaster, String imageStatus, String imageDescribe, Date imageLast) {
        this.imageId = imageId;
        this.imageName = imageName;
        this.imageMaster = imageMaster;
        this.imageStatus = imageStatus;
        this.imageDescribe = imageDescribe;
        this.imageLast = imageLast;
    }

    public ProductImage() {
        super();
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName == null ? null : imageName.trim();
    }

    public String getImageMaster() {
        return imageMaster;
    }

    public void setImageMaster(String imageMaster) {
        this.imageMaster = imageMaster == null ? null : imageMaster.trim();
    }

    public String getImageStatus() {
        return imageStatus;
    }

    public void setImageStatus(String imageStatus) {
        this.imageStatus = imageStatus == null ? null : imageStatus.trim();
    }

    public String getImageDescribe() {
        return imageDescribe;
    }

    public void setImageDescribe(String imageDescribe) {
        this.imageDescribe = imageDescribe == null ? null : imageDescribe.trim();
    }

    public Date getImageLast() {
        return imageLast;
    }

    public void setImageLast(Date imageLast) {
        this.imageLast = imageLast;
    }
}