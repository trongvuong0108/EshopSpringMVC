package com.code.Entities;

import com.code.Enum.checkoutType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    private UUID id;

    @NotNull(message = "total price not null")
    @NotEmpty(message = "total price not empty")
    @NotBlank(message = "total price not blank")
    private float totalPrice;

    @NotNull(message = "customer name not null")
    @NotEmpty(message = "customer name not empty")
    @NotBlank(message = "customer name not blank")
    private String customerName;

    @NotNull(message = "address not null")
    @NotEmpty(message = "address not empty")
    @NotBlank(message = "address not blank")
    private String address;

    @NotNull(message = "check out type not null")
    @NotEmpty(message = "check out type not empty")
    @NotBlank(message = "check out type not blank")
    private checkoutType billType;

}
