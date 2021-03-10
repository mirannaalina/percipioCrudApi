package com.percipioCRUD.crudApi.controllers;

import com.percipioCRUD.crudApi.model.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class ProductDeleteController {


    @DeleteMapping("/delete/product/{sku}")
    @ResponseBody
    public String deleteProductRecord(@PathVariable("sku") String sku){
        return ProductRepository.getInstance().deleteProduct(sku);
    }

}
