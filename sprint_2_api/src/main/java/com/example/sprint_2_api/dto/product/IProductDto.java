package com.example.sprint_2_api.dto.product;

public interface IProductDto {
    Long getId();
    String getName();
    String getNameCategory();
    Double getPrice();
    String getImage();
    Long getIdCategory();
    Double getPriceSale();
    Integer getQuantity();
}
