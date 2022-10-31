package com.applicationforbank.bankapplicationbackend.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankBean {

    //Bean for the storage of Bank Details perfect distribution
    private Integer accountNumber;

    private int aadhaarCardNumber;

    private int mobileNumber;

    private String emailId;

    private String userName;

    private String  panCardNo;
}
