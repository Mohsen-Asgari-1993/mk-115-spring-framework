package ir.maktabsharif.spring.service;

public class FirstService {

    private String name;

    private SecondService secondService;

    public FirstService(SecondService service) {
        this.secondService = service;
        System.out.println("in FirstService Constructor");
    }

    public void afterInit() {
        System.out.println("firstService after init");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SecondService getSecondService() {
        return secondService;
    }
}
