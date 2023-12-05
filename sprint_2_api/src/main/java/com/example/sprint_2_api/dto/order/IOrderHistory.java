package com.example.sprint_2_api.dto.order;

public interface IOrderHistory {
    Long getId();
    String getDateOfOrder();
    String getTimeOfOrder();
    Double getTotalMoney();
    String getInfoBuy();
}
