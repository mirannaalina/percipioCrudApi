package com.percipioCRUD.crudApi.controllers;

import com.percipioCRUD.crudApi.model.Product;
import com.percipioCRUD.crudApi.model.ProductRepository;
import com.percipioCRUD.crudApi.model.ProductRepositoryRelay;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class ProductRegistrationController {


    @PostMapping("/add/product")
    @ResponseBody
    public ProductRepositoryRelay registerProduct(@RequestBody Product product){

        ProductRepositoryRelay productrelay = new ProductRepositoryRelay();
        ProductRepository.getInstance().add(product);

        productrelay.setName(product.getName());
        productrelay.setSku(product.getSku());

        return productrelay;


    }
}
