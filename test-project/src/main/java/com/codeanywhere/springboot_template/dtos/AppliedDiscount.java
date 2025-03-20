package com.codeanywhere.springboot_template.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class AppliedDiscount  {

   
    public String type;
    public Long percentage;
    

}