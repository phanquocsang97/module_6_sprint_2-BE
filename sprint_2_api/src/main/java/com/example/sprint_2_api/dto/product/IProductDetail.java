package com.example.sprint_2_api.dto.product;

public interface IProductDetail {
    Long getId();
    String getName();
    Double getPrice();
    Double getPriceSale();
    Integer getQuantity();
    String getDescription();// mô tả ngắn
    String getIntendedUsers();// đối tượng sử dụng
    String getIngredients();// thành phần
    String getHowToUse();// cách sử dụng
    String getStorage();// bảo quản
    String getPackaging();//quy cách đóng gói
    Long getIdCategory();
    String getNameCategory();
    String getImage();
}
