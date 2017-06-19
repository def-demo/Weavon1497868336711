package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.models.Transactioninfo;


import com.oneplatform.fleet.exception.NotFoundException;
import java.util.List;

public interface TransactioninfoApiService {
  
      List<Transactioninfo> findAllTransactioninfo()
      throws NotFoundException;
  
      Transactioninfo updateTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException;
  
      Transactioninfo addTransactioninfo(Transactioninfo transactioninfo)
      throws NotFoundException;
  
      Transactioninfo findByIdTransactioninfo(Integer id)
      throws NotFoundException;
  
      void deleteTransactioninfo(Integer id)
      throws NotFoundException;
  
}

