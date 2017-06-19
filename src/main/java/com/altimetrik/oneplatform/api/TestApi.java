package com.altimetrik.oneplatform.api;

import com.altimetrik.oneplatform.models.*;

import com.altimetrik.oneplatform.api.service.TestApiService;

import com.oneplatform.fleet.exception.NotFoundException;

import com.altimetrik.oneplatform.models.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class TestApi {

   @Autowired
   private TestApiService service;
  

  @RequestMapping(value = "/test", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Test>> findAllTest()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Test>>(service.findAllTest(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Test> updateTest(@RequestBody Test test
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test>(service.updateTest(test), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Test> addTest(@RequestBody Test test
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test>(service.addTest(test), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Test> findByIdTest(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Test>(service.findByIdTest(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/test/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTest(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteTest(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

