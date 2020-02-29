package com.geely.entity.admin;

import java.util.Date;

public class ProductDetails {
    private Integer detailsId;

    private String detailsName;

    private String detailsImageOne;

    private String detailsImageTwo;

    private String detailsImageThree;

    private String detailsImageFour;

    private String detailsImageFive;

    private Date detailsLast;

    public ProductDetails(Integer detailsId, String detailsName, String detailsImageOne, String detailsImageTwo, String detailsImageThree, String detailsImageFour, String detailsImageFive, Date detailsLast) {
        this.detailsId = detailsId;
        this.detailsName = detailsName;
        this.detailsImageOne = detailsImageOne;
        this.detailsImageTwo = detailsImageTwo;
        this.detailsImageThree = detailsImageThree;
        this.detailsImageFour = detailsImageFour;
        this.detailsImageFive = detailsImageFive;
        this.detailsLast = detailsLast;
    }

    public ProductDetails() {
        super();
    }

    public Integer getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(Integer detailsId) {
        this.detailsId = detailsId;
    }

    public String getDetailsName() {
        return detailsName;
    }

    public void setDetailsName(String detailsName) {
        this.detailsName = detailsName == null ? null : detailsName.trim();
    }

    public String getDetailsImageOne() {
        return detailsImageOne;
    }

    public void setDetailsImageOne(String detailsImageOne) {
        this.detailsImageOne = detailsImageOne == null ? null : detailsImageOne.trim();
    }

    public String getDetailsImageTwo() {
        return detailsImageTwo;
    }

    public void setDetailsImageTwo(String detailsImageTwo) {
        this.detailsImageTwo = detailsImageTwo == null ? null : detailsImageTwo.trim();
    }

    public String getDetailsImageThree() {
        return detailsImageThree;
    }

    public void setDetailsImageThree(String detailsImageThree) {
        this.detailsImageThree = detailsImageThree == null ? null : detailsImageThree.trim();
    }

    public String getDetailsImageFour() {
        return detailsImageFour;
    }

    public void setDetailsImageFour(String detailsImageFour) {
        this.detailsImageFour = detailsImageFour == null ? null : detailsImageFour.trim();
    }

    public String getDetailsImageFive() {
        return detailsImageFive;
    }

    public void setDetailsImageFive(String detailsImageFive) {
        this.detailsImageFive = detailsImageFive == null ? null : detailsImageFive.trim();
    }

    public Date getDetailsLast() {
        return detailsLast;
    }

    public void setDetailsLast(Date detailsLast) {
        this.detailsLast = detailsLast;
    }
}