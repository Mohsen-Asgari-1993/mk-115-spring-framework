package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

@Component
public class SecondService {

    public SecondService() {
        System.out.println("in secondService Constructor");
    }

    public void print() {
        System.out.println("in secondService print");
    }
}
