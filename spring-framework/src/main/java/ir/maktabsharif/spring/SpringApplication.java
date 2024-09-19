package ir.maktabsharif.spring;

import ir.maktabsharif.spring.service.FirstService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml"
        );
        FirstService firstService = (FirstService) applicationContext.getBean("firstService");
        firstService.afterInit();
        System.out.println(firstService.getName());
        firstService.getSecondService().print();
    }

}
