package com.eazybytes.accounts.entity;


import jakarta.persistence.*;

@Entity
public class Customer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private long customer_id;

    private String name;

    private String email;
    @Column(name="mobile_number")
    private String mobileNumber;

    public Customer() {
    }

    public Customer(long customer_id, String name, String email, String mobileNumber) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
    public Customer( String name, String email, String mobileNumber) {

        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
