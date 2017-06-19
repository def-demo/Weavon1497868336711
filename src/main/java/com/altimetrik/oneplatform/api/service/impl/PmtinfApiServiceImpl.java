package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.models.Pmtinf;


import java.util.List;
import com.oneplatform.fleet.exception.NotFoundException;


@Service
@Transactional
public class PmtinfApiServiceImpl implements PmtinfApiService {
		  	  
	  @Autowired
	
  	  private PmtinfRepository  pmtinfRepository ;
	   
  
  
				
			
      @Override
      public List<Pmtinf> findAllPmtinf()
      throws NotFoundException {
      
        
  		
  		
  			return pmtinfRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf updatePmtinf(Pmtinf pmtinf)
      throws NotFoundException {
      
         
        	return pmtinfRepository.save(pmtinf);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf addPmtinf(Pmtinf pmtinf)
      throws NotFoundException {
      
         
        	return pmtinfRepository.save(pmtinf);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Pmtinf findByIdPmtinf(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return pmtinfRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deletePmtinf(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

