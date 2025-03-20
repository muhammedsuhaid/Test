package com.codeanywhere.springboot_template.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.codeanywhere.springboot_template.Entity.Promo_codes;


@Repository
public interface Promo_codesRepository extends JpaRepository<Promo_codes, String>  {

    
}