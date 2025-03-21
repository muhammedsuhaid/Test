package com.codeanywhere.springboot_template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeanywhere.springboot_template.Entity.Products;


@Repository
public interface ProductRepository extends JpaRepository<Products, String>  {

    
}