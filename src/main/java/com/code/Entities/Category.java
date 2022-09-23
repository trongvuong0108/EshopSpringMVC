package com.code.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class Category {
    @Id
    private UUID id;
    @Column(unique = true)
    @NotNull(message = "product name not null")
    @NotEmpty(message = "product name not empty")
    @NotBlank(message = "product name not blank")
    private String name ;


}
