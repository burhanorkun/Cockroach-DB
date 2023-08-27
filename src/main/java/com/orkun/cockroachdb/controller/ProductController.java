package com.orkun.cockroachdb.controller;

import com.orkun.cockroachdb.entity.Product;
import com.orkun.cockroachdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public void createProduct(@RequestBody Product product){
        this.productService.createProduct(product);
    }

    @GetMapping("/all")
    public Mono<List<Product>> getAllProducts(){
        return Mono.fromSupplier(() -> this.productService.getAllProducts());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable final String id){
        this.productService.deleteProduct(UUID.fromString(id));
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody final Product product){
       return this.productService.updateProduct(product);
    }

}
