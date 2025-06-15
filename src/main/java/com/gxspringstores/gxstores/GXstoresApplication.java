package com.gxspringstores.gxstores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GXstoresApplication {
    public static void main(String[] args) {

//        SpringApplication.run(GXstoresApplication.class, args);
          ApplicationContext context=SpringApplication.run(GXstoresApplication.class, args);
          var orderInstance=context.getBean(OrderService.class);
//          OrderService o=new OrderService(new PhonePayUpi());
          orderInstance.placeOrder();
    }


}
