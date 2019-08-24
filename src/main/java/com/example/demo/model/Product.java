package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Long productId;

    @NotNull
    @NotEmpty
    @Column(name = "product_desc")
    private String desc;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "width")
    private Double width;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "quantity")
    private String quantityPerPack;

    @Column(name = "shelf_life")
    private String shelfLife;

    @Column(name = "buying_price")
    private Double buyingPrice;

    @Column(name = "selling_price")
    private String sellingPrice;

    @Column(name = "margin")
    private Double margin;

    @Column(name = "profit_factor")
    private String profitFactor;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getQuantityPerPack() {
        return quantityPerPack;
    }

    public void setQuantityPerPack(String quantityPerPack) {
        this.quantityPerPack = quantityPerPack;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Double getMargin() {
        return margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public String getProfitFactor() {
        return profitFactor;
    }

    public void setProfitFactor(String profitFactor) {
        this.profitFactor = profitFactor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", desc='" + desc + '\'' +
                ", companyName='" + companyName + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", quantityPerPack='" + quantityPerPack + '\'' +
                ", shelfLife='" + shelfLife + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", margin=" + margin +
                ", profitFactor='" + profitFactor + '\'' +
                '}';
    }
}