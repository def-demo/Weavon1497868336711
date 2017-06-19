package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.models.Routingrule;


import java.util.List;
import com.oneplatform.fleet.exception.NotFoundException;


@Service
@Transactional
public class RoutingruleApiServiceImpl implements RoutingruleApiService {
		  	  
	  @Autowired
	
  	  private RoutingruleRepository  routingruleRepository ;
	   
  
  
				
			
      @Override
      public List<Routingrule> findAllRoutingrule()
      throws NotFoundException {
      
        
  		
  		
  			return routingruleRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Routingrule updateRoutingrule(Routingrule routingrule)
      throws NotFoundException {
      
         
        	return routingruleRepository.save(routingrule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Routingrule addRoutingrule(Routingrule routingrule)
      throws NotFoundException {
      
         
        	return routingruleRepository.save(routingrule);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Routingrule findByIdRoutingrule(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return routingruleRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRoutingrule(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

