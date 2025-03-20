package com.codeanywhere.springboot_template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeanywhere.springboot_template.Entity.Quantity_discounts;


@Repository
public interface Quantity_discountsRepository extends JpaRepository<Quantity_discounts, Integer>  {

    
}