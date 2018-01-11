package com.studbaza.shop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlTransient;
import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @Pattern(regexp = "P[0-9]+", message = "{Pattern.Product.productId.validation}")
    private String productId;

    @Size(min = 4, max = 50, message = "{Size.Product.name.validation}")
    private String name;

    @Min(value = 0, message = "Min.Product.unitPrice.validation}")
    @Digits(integer = 8, fraction = 2, message = "{Digits.Product.unitPrice.validation}")
    @NotNull(message = "{NotNull.Product.unitPrice.validation}")
    private BigDecimal unitPrice;

    private String description;
    private String manufacturer;


    private String category;
    private long unitsInStock;
    private long unitsInOrder;
    private String productImage;


    @Override
    public String toString() {
        return "Produkt [productId=" + productId + ", nazwa=" + name + "]";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}