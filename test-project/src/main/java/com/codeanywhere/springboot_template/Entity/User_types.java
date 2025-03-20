package com.codeanywhere.springboot_template.Entity;

import org.springframework.stereotype.Repository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class User_types  {

   @Id
    public String type;
    public Long discount_percentage;
   

}