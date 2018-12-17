package com.example.pyg.pinyougousellersbackstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pyg.pinyougousellersbackstage.dao")
public class PinyougouSellersBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouSellersBackstageApplication.class, args);
    }

}

