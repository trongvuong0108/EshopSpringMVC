package com.code.Entities;

import com.code.Models.ProductModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id @GeneratedValue
    @Type(type = "uuid-char")
    @Column(length = 36)
    private UUID id;
    @NotNull(message = "product name not null")
    @NotEmpty(message = "product name not empty")
    @NotBlank(message = "product name not blank")
    private String name ;
    @NotNull(message = "description name not null")
    @NotEmpty(message = "description name not empty")
    @NotBlank(message = "description name not blank")
    private String description;
    @NotNull(message = "quantity name not null")
    private float quantity;
    @NotNull(message = "priceIn name not null")
    private float priceIn;
    @NotNull(message = "priceOut name not null")
    private float priceOut;
    private String img ;
    private boolean enable;

    public Product(ProductModel productModel) {
        this.name = productModel.getName();
        this.description = productModel.getDescription();
        this.quantity = productModel.getQuantity();
        this.priceIn = productModel.getPriceIn();
        this.priceOut = productModel.getPriceOut();
        this.img = productModel.getImg();
    }

    public Product(String name, String description, float quantity, float priceIn, float priceOut, String img, boolean enable) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.img = img;
        this.enable = enable;
    }
}
