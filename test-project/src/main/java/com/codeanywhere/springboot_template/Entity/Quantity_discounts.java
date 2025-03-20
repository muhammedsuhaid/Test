package com.codeanywhere.springboot_template.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Quantity_discounts   {

   @Id
    public Integer id;
    public int  min_quantity ;
    public long discount_percentage;
   
   

}