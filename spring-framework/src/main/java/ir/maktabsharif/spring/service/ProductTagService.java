package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class ProductTagService {

    public ProductTagService() {
        System.out.println("in ProductTagService Constructor");
    }

    public void print() {
        System.out.println("in ProductTagService print");
    }

    public void findAllByTagIds(Set<Long> tagIds) {

    }

    public void deleteById(Long tagId) {
    }
}
