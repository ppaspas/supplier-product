package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SUPPLIER")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Supplier  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="supplier_id")
    private Long supplierId;

    @NotNull
    @NotEmpty
    @Column(name="supplier_name")
    private String supplier;

    @Column(name="contact_person")
    private String contactPerson;

    @Column(name="Phone_number")
    private String phoneNumber;

    @Column(name="Email")
    private String email;

//    public Supplier(Long supplierId, String company, String contactPerson, String  phoneNumber, String email) {
//        this.supplierId = supplierId;
//        this.company = company;
//        this.contactPerson = contactPerson;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//    }

    public Supplier(String supplier, String contactPerson, String  phoneNumber, String email) {

        this.supplier = supplier;
        this.contactPerson = contactPerson;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Supplier() {
    }


    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId='" + supplierId + '\'' +
                ", supplier='" + supplier + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
