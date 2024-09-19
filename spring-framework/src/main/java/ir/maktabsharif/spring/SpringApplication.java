package ir.maktabsharif.spring;

import ir.maktabsharif.spring.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringApplication.class
        );

        ProductService firstService = applicationContext.getBean(ProductService.class);
        firstService.printSecondService();
    }
}
