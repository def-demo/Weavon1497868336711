package com.altimetrik.oneplatform.models.repository;

import com.altimetrik.oneplatform.models.*;

import com.altimetrik.oneplatform.models.Transactiondetails;
import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PmtinfRepository extends JpaRepository<Pmtinf, Integer>{

}



