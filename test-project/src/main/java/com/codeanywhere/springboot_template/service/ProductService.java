package com.codeanywhere.springboot_template.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeanywhere.springboot_template.Entity.Products;
import com.codeanywhere.springboot_template.Entity.Promo_codes;
import com.codeanywhere.springboot_template.Entity.Quantity_discounts;
import com.codeanywhere.springboot_template.Entity.User_types;
import com.codeanywhere.springboot_template.dtos.AppliedDiscount;
import com.codeanywhere.springboot_template.dtos.ProductRequest;
import com.codeanywhere.springboot_template.dtos.ProductResponse;
import com.codeanywhere.springboot_template.repository.ProductRepository;
import com.codeanywhere.springboot_template.repository.Promo_codesRepository;
import com.codeanywhere.springboot_template.repository.Quantity_discountsRepository;
import com.codeanywhere.springboot_template.repository.User_typesRepository;

import jakarta.validation.ValidationException;


@Service
public class ProductService  {

@Autowired
private ProductRepository productRepository;

@Autowired
private Promo_codesRepository promo_codesRepository;

@Autowired
private Quantity_discountsRepository quantity_discountsRepository;

@Autowired
private User_typesRepository user_typesRepository;





public ProductResponse createDiscount(ProductRequest productRequest){

    ProductResponse response = new ProductResponse();

    AppliedDiscount userdiscounts=new AppliedDiscount();
    AppliedDiscount promodiscounts=new AppliedDiscount();
    List<AppliedDiscount> appliedDiscount=new ArrayList();

    if(!productRepository.existsById(productRequest.getProductId())){
        throw new ValidationException("PRODUCT NOT FOUND FOR "+productRequest.getProductId());
    }
    if(!user_typesRepository.existsById(productRequest.getUserType())){

        throw new ValidationException("USER_TYPE NOT FOUND FOR "+productRequest.getUserType());
        }
        
        if(!promo_codesRepository.existsById(productRequest.getPromoCode())){
            throw new ValidationException("PROMO_CODE NOT FOUND FOR "+productRequest.getPromoCode());
        }


    String productId = productRequest.getProductId();
    Products products = productRepository.findById(productId).get();
    long baseprice=products.getBase_price();



Promo_codes promo_codes= promo_codesRepository.findById(productRequest.getPromoCode()).get();

Double quantitydiscount=0.0;
if (productRequest.getQuantity()>=3){

    quantitydiscount=3.0;


}
if (productRequest.getQuantity()>=5){

    quantitydiscount=7.5;


}
if (productRequest.getQuantity()>=10){

    quantitydiscount=12.0;


}


Long pdiscount=promo_codes.getDiscount_percentage();
User_types  user_types=user_typesRepository.findById(productRequest.getUserType()).get();
Long udiscount=user_types.getDiscount_percentage();

userdiscounts.setType(productRequest.getUserType());
userdiscounts.setPercentage(user_types.getDiscount_percentage());
appliedDiscount.add(userdiscounts);

promodiscounts.setType(productRequest.getPromoCode());
promodiscounts.setPercentage(pdiscount);
appliedDiscount.add(promodiscounts);
response.setAppliedDiscount(appliedDiscount);

response.setOrginalPrice(baseprice);

    Long userdiscount=0L;
  if (productRequest.getUserType().equalsIgnoreCase("Regular")){
    userdiscount=user_types.getDiscount_percentage();
  }
  if (productRequest.getUserType().equalsIgnoreCase("Premium")){
    userdiscount=user_types.getDiscount_percentage();
  }
  if (productRequest.getUserType().equalsIgnoreCase("vip")){
    userdiscount=user_types.getDiscount_percentage();
  }

  Double finalPrice=baseprice-(udiscount+pdiscount+quantitydiscount);
  response.setFinalPrice(finalPrice);


  Double totalSavings=udiscount+pdiscount+quantitydiscount;
  response.setTotalSavings(totalSavings);





    
   // ProductRepository productRepository=(ProductRepository) productRepository.findById(productRequest.getProductId()).get();
    

return response;
}

    
}