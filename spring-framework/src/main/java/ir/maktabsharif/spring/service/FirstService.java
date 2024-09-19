package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

@Component
public class FirstService {

    private final SecondService secondService;

    public FirstService(SecondService service) {
        this.secondService = service;
        System.out.println("in FirstService Constructor");
    }

    public void afterInit() {
        System.out.println("firstService after init");
    }

    public void printSecondService() {
        secondService.print();
    }
}
