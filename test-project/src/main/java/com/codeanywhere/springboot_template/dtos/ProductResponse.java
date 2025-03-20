package com.codeanywhere.springboot_template.dtos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class ProductResponse  {

   
    public String productId;
    public Long orginalPrice;
    public Double finalPrice;
    public List<AppliedDiscount> appliedDiscount;
    public Double totalSavings;

}