package com.applicationforbank.bankapplicationbackend.repository;

import com.applicationforbank.bankapplicationbackend.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository where the data get store and flow starts
public interface BankRepository extends JpaRepository<BankEntity,Integer> {

    
}
