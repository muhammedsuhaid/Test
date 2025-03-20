package com.codeanywhere.springboot_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.codeanywhere.springboot_template.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeanywhere.springboot_template.dtos.ProductRequest;
import com.codeanywhere.springboot_template.dtos.ProductResponse;

@RestController
@RequestMapping("/api/products")
public class ProductController {
@Autowired
    public ProductService productService;


    @PostMapping("/price-calculation")
    public ResponseEntity<ProductResponse> createDiscount(
   @RequestBody ProductRequest request
    ) {
       // return productService.createDiscount(request);
       return ResponseEntity.ok(productService.createDiscount(request));

    }
}

