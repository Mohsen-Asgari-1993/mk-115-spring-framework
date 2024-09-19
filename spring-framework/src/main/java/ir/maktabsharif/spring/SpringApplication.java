package ir.maktabsharif.spring;

import ir.maktabsharif.spring.service.FirstService;
import ir.maktabsharif.spring.service.ThirdService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "ir.maktabsharif.spring"
        );

        FirstService firstService = (FirstService) applicationContext.getBean("firstService");
        firstService.afterInit();
        firstService.printSecondService();

        applicationContext.getBean(ThirdService.class).print();
    }

}
