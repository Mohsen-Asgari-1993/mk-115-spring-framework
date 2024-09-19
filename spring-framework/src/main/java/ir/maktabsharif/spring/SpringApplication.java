package ir.maktabsharif.spring;

import ir.maktabsharif.spring.config.BeanConfig;
import ir.maktabsharif.spring.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                BeanConfig.class
        );

        ProductService firstService = applicationContext.getBean(ProductService.class);
        firstService.printSecondService();
    }
}
