package com.altimetrik.oneplatform.models.repository;

import com.altimetrik.oneplatform.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TestRepository extends JpaRepository<Test, Integer>{

}



