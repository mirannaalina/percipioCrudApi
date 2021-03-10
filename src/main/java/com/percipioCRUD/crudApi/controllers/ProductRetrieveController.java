package com.percipioCRUD.crudApi.controllers;


import com.percipioCRUD.crudApi.model.Product;
import com.percipioCRUD.crudApi.model.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductRetrieveController {


    @GetMapping("/product/allproduct")
    @ResponseBody
    public List<Product> getAllProducts(){

        return ProductRepository.getInstance().getProductRecords();
    }



}
