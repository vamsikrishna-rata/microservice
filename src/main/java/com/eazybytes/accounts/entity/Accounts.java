package com.eazybytes.accounts.entity;

import jakarta.persistence.*;

@Entity
public class Accounts extends BaseEntity {
    @Column(name="customer_id")
    private long customer_id;
    //here i am not incrementaing the primary key because accountnumber contains 10 digits
    // for that i am writing the logic in rest apis
    @Id
    @Column(name="account_number")
     private long accountNumber;

    @Column(name="account_type")
     private String accountType;

    @Column(name="branch_address")
     private String branchAddress;

    public Accounts() {
    }

    public Accounts( long accountNumber, String accountType, String branchAddress) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.branchAddress = branchAddress;
    }


    public long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(long customer_id) {
        this.customer_id = customer_id;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }
}
