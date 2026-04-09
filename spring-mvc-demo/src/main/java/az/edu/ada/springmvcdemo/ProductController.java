package az.edu.ada.springmvcdemo;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public List<ProductDto> getProducts() {
        System.out.println(">>>Get Products Called!<<<");
        return Arrays.asList(
                new ProductDto(1L, "Book #1", 123.321),
                new ProductDto(2L, "Book #2", 123.321),
                new ProductDto(3L, "Book #3", 123.321)
        );
    }

    @GetMapping("/{id}")
    public ProductDto getProducts(@PathVariable Long id) {
        System.out.println(">>>Get Product Called!<<<");
        return new ProductDto(1L, "Book #1", 123.321);
    }
}
