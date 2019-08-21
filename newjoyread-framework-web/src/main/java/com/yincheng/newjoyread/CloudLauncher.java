package com.yincheng.newjoyread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.yincheng.newjoyread"})
public class CloudLauncher {

    public static void main(String[] args) {
        SpringApplication.run(CloudLauncher.class, args);
    }
}
