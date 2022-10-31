package com.applicationforbank.bankapplicationbackend.service;

import com.applicationforbank.bankapplicationbackend.bean.BankBean;
import com.applicationforbank.bankapplicationbackend.entity.BankEntity;
import com.applicationforbank.bankapplicationbackend.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

//main connection and business layer between the actual app and customer
@Service
public class BankService {
    @Autowired
    private BankRepository bankRepository;

    //method to save the data from the angular page
    public Boolean saveCustomerData(BankBean bankBean){
        try {
            if (Objects.nonNull(bankBean.getAccountNumber())) {
                Optional<BankEntity> customerData = bankRepository.findById(bankBean.getAccountNumber());
                BankEntity getDataCustomer = customerData.get();
                getDataCustomer.setAccountNumber(bankBean.getAccountNumber());
                getDataCustomer.setAadhaarCardNumber(bankBean.getAadhaarCardNumber());
                getDataCustomer.setEmailId(bankBean.getEmailId());
                getDataCustomer.setMobileNumber(bankBean.getMobileNumber());
                getDataCustomer.setUserName(bankBean.getUserName());
                getDataCustomer.setPanCardNo(bankBean.getPanCardNo());
                bankRepository.save(getDataCustomer);
                return true;
            }else {
                BankEntity newBankCustomer = new BankEntity();
                newBankCustomer.setAadhaarCardNumber(bankBean.getAadhaarCardNumber());
                newBankCustomer.setEmailId(bankBean.getEmailId());
                newBankCustomer.setUserName(bankBean.getUserName());
                newBankCustomer.setMobileNumber(bankBean.getMobileNumber());
                newBankCustomer.setPanCardNo(bankBean.getPanCardNo());
                bankRepository.save(newBankCustomer);
                return true;
            }
            }catch (Exception anyException){
            return false;
        }
    }


        //method to get the Customer by Id
    public BankEntity getCustomer(int accountNumberCustomer){
        return bankRepository.findById(accountNumberCustomer).orElse(null);
    }


    //method to delete the customer by id
    public Boolean deleteCustomerData(int id){
        try{
            BankEntity entityDelete = bankRepository.getReferenceById(id);
            Optional<BankEntity> entityId = bankRepository.findById(id);
            if (entityId.isPresent()){
                bankRepository.delete(entityDelete);
                return  true;
            }else{
                return false;
            }
        }catch (Exception deleteException){
            return false;

        }
    }


    public Boolean passWord(String pass){
        return true;
    }
}
