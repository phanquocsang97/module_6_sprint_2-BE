package com.example.sprint_2_api.dto.cart;

public interface ICartDto {
    Long getIdCart();
    Long getIdUser();
    Long getIdProduct();
    String getName();
    Double getPrice();
    Double getPriceSale();
    String getImage();
    Integer getQuantity();
    Integer getMaxQuantity();
}
