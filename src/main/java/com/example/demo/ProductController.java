package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products") // ده عنوان الصفحة
@CrossOrigin(origins = "*") // عشان الويب يشتغل من غير مشاكل
public class ProductController {

    private final ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    // 1. يرجع كل المنتجات
    @GetMapping
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    // 2. يضيف منتج جديد
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repository.save(product);
    }
    
    // 3. تعديل منتج (Update)
    @PutMapping("/{sku}")
    public Product updateProduct(@PathVariable String sku, @RequestBody Product product) {
        // دالة save لو لقت الـ ID موجود بتعمل Update، ولو مش موجود بتعمل Insert
        return repository.save(product); 
    }

    // 4. حذف منتج (Delete)
    @DeleteMapping("/{sku}")
    public void deleteProduct(@PathVariable String sku) {
        repository.deleteById(sku);
    }
}
