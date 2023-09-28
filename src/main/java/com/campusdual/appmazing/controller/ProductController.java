package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.IProductService;
import com.campusdual.appmazing.model.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products") // esto significa que mi url va a responder a partir de /products
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping
    public String testController(){
        return "Product controller works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){
        return "Product controller works, " + name + "!";
    }

    @GetMapping(value = "/testMethod")
    public String testControllerMethod (){
        return "Product controller method wroks!";
    }

    @PostMapping(value = "/get")
    public ProductDTO queryProduct(@RequestBody ProductDTO product){
        return this.productService.queryProduct(product);
    }

    @GetMapping(value = "/getAll")
    public List<ProductDTO> queryAllProducts(){
        return this.productService.queryAllProducts();
    }

    @PostMapping(value = "/add")
    public int insertProduct (@RequestBody ProductDTO product){
        return this.productService.insertProduct(product);
    }

    @PutMapping(value = "/update")
    public int updateProduct(@RequestBody ProductDTO product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping(value = "/delete")
    public int deleteProduct(@RequestBody ProductDTO product){
        return this.productService.deleteProduct(product);
    }

}
