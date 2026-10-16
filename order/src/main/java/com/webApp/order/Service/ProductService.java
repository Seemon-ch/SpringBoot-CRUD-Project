package com.webApp.order.Service;

import com.webApp.order.Model.Product;
import org.springframework.stereotype.Service;

import javax.management.loading.PrivateClassLoader;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    //dummy data
    List<Product> products = Arrays.asList(
            new Product (101,"Iphone" , 50000),
            new Product (102,"Canon Camera" , 70000)

    );
    public List<Product> getProducts(){
        return null;
    }
}
