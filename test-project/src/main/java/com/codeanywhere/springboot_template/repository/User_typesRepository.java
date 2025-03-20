package com.codeanywhere.springboot_template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeanywhere.springboot_template.Entity.User_types;


@Repository
public interface User_typesRepository extends JpaRepository<User_types, String>  {

    
}