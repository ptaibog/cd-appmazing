package com.campusdual.appmazing.controller;


import com.campusdual.appmazing.api.ICategoryService;
import com.campusdual.appmazing.model.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String testController(){
        return "Category controller works!";
    }

    @PostMapping(value = "/get")
    public CategoryDTO queryCategory (@RequestBody CategoryDTO category){
        return this.categoryService.queryCategory(category);
    }

    @GetMapping (value = "/getAll")
    public List<CategoryDTO> queryAllCategories(){
        return this.categoryService.queryAllCategories();
    }

    @PostMapping(value = "/add")
    public int insertCategory(@RequestBody CategoryDTO category){
        return this.categoryService.insertCategory(category);
    }

    @PutMapping(value = "/update")
    public int updateCategory(@RequestBody CategoryDTO category){
        return this.categoryService.updateCategory(category);
    }

    @DeleteMapping(value = "/delete")
    public int  deleteCategory(@RequestBody CategoryDTO category){
        return this.categoryService.deleteCategory(category);
    }
}
