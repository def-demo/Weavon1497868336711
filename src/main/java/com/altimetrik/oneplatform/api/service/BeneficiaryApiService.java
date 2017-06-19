package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.models.Beneficiary;


import com.oneplatform.fleet.exception.NotFoundException;
import java.util.List;

public interface BeneficiaryApiService {
  
      List<Beneficiary> findAllBeneficiary()
      throws NotFoundException;
  
      Beneficiary updateBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary addBeneficiary(Beneficiary beneficiary)
      throws NotFoundException;
  
      Beneficiary findByIdBeneficiary(Long id)
      throws NotFoundException;
  
      void deleteBeneficiary(Long id)
      throws NotFoundException;
  
}

