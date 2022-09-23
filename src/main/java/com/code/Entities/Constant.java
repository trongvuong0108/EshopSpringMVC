package com.code.Entities;

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
public class Constant {
    @Id
    private UUID id;

    @NotNull(message = "name name not null")
    @NotEmpty(message = "name name not empty")
    @NotBlank(message = "name name not blank")
    private String name;

    @NotNull(message = "value name not null")
    @NotEmpty(message = "value name not empty")
    @NotBlank(message = "value name not blank")
    private float value;
}
