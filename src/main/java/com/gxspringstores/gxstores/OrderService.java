package com.gxspringstores.gxstores;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final UPIPaymentServices upiPaymentServices;
    public OrderService(UPIPaymentServices upiPaymentServices) {
        this.upiPaymentServices = upiPaymentServices;
    }
    public String placeOrder() {
        upiPaymentServices.pay(500);
        System.out.println("Order Placed Successfully");
        return "Order Placed";
    }
}
