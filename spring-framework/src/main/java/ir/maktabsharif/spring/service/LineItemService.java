package ir.maktabsharif.spring.service;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class LineItemService {

    private final ProductService productService;

    private final ProductTagService productTagService;

    public LineItemService(ProductService productService, ProductTagService productTagService) {
        this.productService = productService;
        this.productTagService = productTagService;
    }

    public void createProduct(Set<Long> tagIds) {
        productTagService.findAllByTagIds(tagIds);
        productService.create(tagIds);
//        TODO impl logic
    }

    public void deleteTagById(Long tagId) {
        if (productService.existsByTagId(tagId)) {
            throw new RuntimeException("there is product with this tagId");
        }
        productTagService.deleteById(tagId);
    }
}
