package com.altimetrik.oneplatform.api.service.impl;

import com.altimetrik.oneplatform.api.service.*;
import com.altimetrik.oneplatform.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.oneplatform.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.oneplatform.models.Test;


import java.util.List;
import com.oneplatform.fleet.exception.NotFoundException;


@Service
@Transactional
public class TestApiServiceImpl implements TestApiService {
		  	  
	  @Autowired
	
  	  private TestRepository  testRepository ;
	   
  
  
				
			
      @Override
      public List<Test> findAllTest()
      throws NotFoundException {
      
        
  		
  		
  			return testRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test updateTest(Test test)
      throws NotFoundException {
      
         
        	return testRepository.save(test);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test addTest(Test test)
      throws NotFoundException {
      
         
        	return testRepository.save(test);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Test findByIdTest(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return testRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteTest(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

