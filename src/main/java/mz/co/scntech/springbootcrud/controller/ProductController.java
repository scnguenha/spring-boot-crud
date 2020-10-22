package mz.co.scntech.springbootcrud.controller;

import mz.co.scntech.springbootcrud.entity.Product;
import mz.co.scntech.springbootcrud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sidónio Goenha on 9/28/2020
 */
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
