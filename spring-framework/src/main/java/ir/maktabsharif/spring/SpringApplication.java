package ir.maktabsharif.spring;

import ir.maktabsharif.spring.service.CustomerService;
import ir.maktabsharif.spring.service.MeliPayamakSender;
import ir.maktabsharif.spring.service.SmsIrSender;
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

        SmsIrSender smsIrSender = applicationContext.getBean(SmsIrSender.class);
        MeliPayamakSender meliPayamakSender = applicationContext.getBean(MeliPayamakSender.class);

//        SmsSender smsSender = applicationContext.getBean(SmsSender.class);
//        System.out.println(smsSender.getClass().getSimpleName());

        CustomerService bean = applicationContext.getBean(CustomerService.class);
        System.out.println("done");
    }
}
