package com.codeanywhere.springboot_template.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Products  {

   @Id 
    public String id;
    public String name;
    public String description;
    public long base_price;
    public String category;
    public int available_quantity;
    

}