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
    @Column(name = "product_barcode")
    private String barcode;


    @NotNull
    @NotEmpty
    @Column(name = "product_type")
    private String productType;

    @NotNull
    @NotEmpty
    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_desc")
    private String productDesc;

    @NotNull
    @NotEmpty
    @Column(name = "supplier_name")
    private String supplier;

    @Column(name = "width")
    private Double width;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "quantity_pack")
    private String quantityPerPack;

    @Column(name = "width_pack")
    private Double widthPerPack;

    @Column(name = "length_pack")
    private Double lengthPerPack;

    @Column(name = "height_pack")
    private Double heightPerPack;

    @Column(name = "weight_pack")
    private Double weightPerPack;

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


    @Column(name = "moq")
    private String moq;


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
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


    public Double getWidthPerPack() {
        return widthPerPack;
    }

    public void setWidthPerPack(Double widthPerPack) {
        this.widthPerPack = widthPerPack;
    }

    public Double getLengthPerPack() {
        return lengthPerPack;
    }

    public void setLengthPerPack(Double lengthPerPack) {
        this.lengthPerPack = lengthPerPack;
    }

    public Double getHeightPerPack() {
        return heightPerPack;
    }

    public void setHeightPerPack(Double heightPerPack) {
        this.heightPerPack = heightPerPack;
    }

    public Double getWeightPerPack() {
        return weightPerPack;
    }

    public void setWeightPerPack(Double weightPerPack) {
        this.weightPerPack = weightPerPack;
    }


    public String getMoq() {
        return moq;
    }

    public void setMoq(String moq) {
        this.moq = moq;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", barcode='" + barcode + '\'' +
                ", productType='" + productType + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", supplier='" + supplier + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", quantityPerPack='" + quantityPerPack + '\'' +
                ", widthPerPack=" + widthPerPack +
                ", lengthPerPack=" + lengthPerPack +
                ", heightPerPack=" + heightPerPack +
                ", weightPerPack=" + weightPerPack +
                ", shelfLife='" + shelfLife + '\'' +
                ", buyingPrice=" + buyingPrice +
                ", sellingPrice='" + sellingPrice + '\'' +
                ", margin=" + margin +
                ", profitFactor='" + profitFactor + '\'' +
                ", moq='" + moq + '\'' +
                '}';
    }
}
