package com.applicationforbank.bankapplicationbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//Entity class where Account Number is Used as Primary Key in Database

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_details_database")
public class BankEntity {

//Here Account Number is working as primary key
    @Id
    @GeneratedValue
    @Column(name = "account_number")
    private Integer accountNumber;

    @Column(name="aadhaar_card")
    private int aadhaarCardNumber;

    @Column(name = "mobile_number")
    private int mobileNumber;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pan_card_number")
    private String  panCardNo;

    @Column(name = "password")
    private String passWord;

    private String confirmPassword;


}
