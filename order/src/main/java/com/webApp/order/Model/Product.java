package com.webApp.order.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//lombok is used.
@Data
@AllArgsConstructor
@Component
public class Product {

    private int prodId;
    private String prodName;
    private int price;

}
