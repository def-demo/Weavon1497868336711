package com.altimetrik.oneplatform.models.repository;

import com.altimetrik.oneplatform.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long>{

}



