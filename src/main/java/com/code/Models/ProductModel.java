package com.code.Models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductModel {
    private String name ;
    private String description;
    private float quantity;
    private float priceIn;
    private float priceOut;
    private String img ;
}
