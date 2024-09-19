package ir.maktabsharif.spring;

import ir.maktabsharif.spring.config.BeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                "ir.maktabsharif.spring"
        );

        BeanConfig beanConfig = applicationContext.getBean(BeanConfig.class);
        beanConfig.print();

//        FirstService firstService = (FirstService) applicationContext.getBean("firstService");
//        firstService.afterInit();
//        System.out.println(firstService.getName());
//        firstService.getSecondService().print();
    }

}
