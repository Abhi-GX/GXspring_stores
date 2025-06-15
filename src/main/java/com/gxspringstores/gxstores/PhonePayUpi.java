package com.gxspringstores.gxstores;

import org.springframework.stereotype.Component;

@Component
public class PhonePayUpi implements UPIPaymentServices {
    public void pay(int amount) {
        System.out.println("Paying from PhonePayUpi :" + amount);
    }
}
