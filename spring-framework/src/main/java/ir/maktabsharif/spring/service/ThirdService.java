package ir.maktabsharif.spring.service;

public class ThirdService {

    private final FirstService firstService;

    public ThirdService(FirstService firstService) {
        this.firstService = firstService;
    }

    public void print() {
        System.out.println("in ThirdService print");
    }

}
