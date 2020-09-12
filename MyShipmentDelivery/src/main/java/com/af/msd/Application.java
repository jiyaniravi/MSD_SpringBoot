package com.af.msd;

import com.af.msd.common.status.OrderStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);

        System.out.println(OrderStatus.UNKNOWN.getBy(2));
    }
}
