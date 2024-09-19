package ir.maktabsharif.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstService {

    @Autowired
    private SecondService secondService;

    public FirstService() {
        System.out.println("in FirstService Constructor");
    }

    public void afterInit() {
        System.out.println("firstService after init");
    }

    public void printSecondService() {
        secondService.print();
    }
}
