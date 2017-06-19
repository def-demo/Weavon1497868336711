package com.altimetrik.oneplatform.api.service;

import com.altimetrik.oneplatform.models.Routingrule;


import com.oneplatform.fleet.exception.NotFoundException;
import java.util.List;

public interface RoutingruleApiService {
  
      List<Routingrule> findAllRoutingrule()
      throws NotFoundException;
  
      Routingrule updateRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule addRoutingrule(Routingrule routingrule)
      throws NotFoundException;
  
      Routingrule findByIdRoutingrule(Integer id)
      throws NotFoundException;
  
      void deleteRoutingrule(Integer id)
      throws NotFoundException;
  
}

