package com.codeanywhere.springboot_template.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class ProductRequest  {

   
    public String productId;
    public Integer quantity;
    public String promoCode;
    public String userType;

}