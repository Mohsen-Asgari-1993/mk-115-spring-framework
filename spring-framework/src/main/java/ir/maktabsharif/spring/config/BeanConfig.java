package ir.maktabsharif.spring.config;

import ir.maktabsharif.spring.service.ThirdService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    public void print() {
        System.out.println("in BeanConfig print");
    }

    @Bean
    public ThirdService thirdService() {
        return new ThirdService();
    }
}
