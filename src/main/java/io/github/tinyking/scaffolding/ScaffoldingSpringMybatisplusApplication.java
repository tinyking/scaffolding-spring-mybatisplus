package io.github.tinyking.scaffolding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.tinyking.scaffolding")
public class ScaffoldingSpringMybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScaffoldingSpringMybatisplusApplication.class, args);
    }

}
