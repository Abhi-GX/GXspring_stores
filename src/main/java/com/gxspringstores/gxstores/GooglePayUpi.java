package com.gxspringstores.gxstores;

public class GooglePayUpi implements UPIPaymentServices {
    public void pay(int amount) {
        System.out.println("Paying from GooglePayUpi :" + amount);
    }
}
