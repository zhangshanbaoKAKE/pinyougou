package com.example.pyg.pinyougouoperatorsbackstage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pyg.pinyougouoperatorsbackstage.dao")
public class PinyougouOperatorsBackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(PinyougouOperatorsBackstageApplication.class, args);
    }

}

