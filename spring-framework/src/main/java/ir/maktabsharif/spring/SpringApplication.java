package ir.maktabsharif.spring;

import ir.maktabsharif.spring.service.SmsIrSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = "classpath:application.properties")
public class SpringApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringApplication.class
        );

        SmsIrSender smsIrSender = applicationContext.getBean(SmsIrSender.class);
        smsIrSender.send(null, null);
    }
}
