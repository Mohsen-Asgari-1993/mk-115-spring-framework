package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ProductService {

    public ProductService() {
        System.out.println("in ProductService Constructor");
    }

    public void create(Set<Long> tagIds) {
//        TODO impl logic
    }

    public void printSecondService() {
        System.out.println("printSecondService");
    }

    public boolean existsByTagId(Long tagId) {
        return true;
    }
}
