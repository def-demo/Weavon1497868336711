package com.altimetrik.oneplatform.models.repository;

import com.altimetrik.oneplatform.models.*;

import com.altimetrik.oneplatform.models.Pmtinf;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TransactioninfoRepository extends JpaRepository<Transactioninfo, Integer>{

}



