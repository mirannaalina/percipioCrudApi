package com.percipioCRUD.crudApi.model;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {


    private List<Product> productRecords;

    private static ProductRepository prdrepo =null;


    private ProductRepository(){
        productRecords =new ArrayList<Product>();
    }


    public static ProductRepository getInstance(){
        if(prdrepo==null){
            prdrepo = new ProductRepository();
            return prdrepo;
        }else{
            return prdrepo;
        }
    }

    public void add(Product prd){
        productRecords.add(prd);
    }

    public String updateProduct(Product prd){
        for(int i=0;i<productRecords.size();i++) {
            Product prdn = productRecords.get(i);
            if (prdn.getSku().equals(prd.getSku())) {
                productRecords.set(i, prd);  //update new record

                return "Update successful";
            }
        }
                return "Update failed";

    }



    public String deleteProduct(String sku){
        for(int i=0; i<=productRecords.size();i++){
            Product prdn = productRecords.get(i);
            if(prdn.getSku().equals(sku)){
                productRecords.remove(i);
                return "Delete successful";
            }
        }
        return "Delete failed";
    }


    public List<Product> getProductRecords(){
        return productRecords;
    }




}



