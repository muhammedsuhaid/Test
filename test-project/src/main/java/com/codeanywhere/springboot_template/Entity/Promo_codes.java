package com.codeanywhere.springboot_template.Entity;

import java.sql.Date;

import org.springframework.stereotype.Repository;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Promo_codes  {

   @Id
    public String code;
    public Long  discount_percentage ;
    public Boolean active;
    public Date valid_until;
   

}