package ir.maktabsharif.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstService {

    private SecondService secondService;

    public FirstService() {
        System.out.println("in FirstService Constructor");
    }

    @Autowired
    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }

    public void afterInit() {
        System.out.println("firstService after init");
    }

    public void printSecondService() {
        secondService.print();
    }
}
