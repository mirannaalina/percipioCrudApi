package com.percipioCRUD.crudApi.controllers;


import com.percipioCRUD.crudApi.model.Product;
import com.percipioCRUD.crudApi.model.ProductRepository;
import com.percipioCRUD.crudApi.model.ProductRepositoryRelay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductUpdateController {



    @PutMapping("/update/product")
    @ResponseBody
    public String updateProductRecord(@RequestBody Product prd){

        return ProductRepository.getInstance().updateProduct(prd);

    }
}
