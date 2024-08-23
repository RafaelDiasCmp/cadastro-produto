package com.abutua.product_backend.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abutua.product_backend.models.Category;

import java.util.Arrays;
import java.util.List;

@RestController // Requisições HTTP
@CrossOrigin
public class CategoryController {

    // Importar classe corretamente
    private List<Category> categories = Arrays.asList(
            new Category(1, "Produção Própria"),
            new Category(2, "Nacional"),
            new Category(3, "Importado"),
            new Category(4, "Premium"));

    // Pega as categorias por ID de cada uma
    @GetMapping("categories/{id}")

    public ResponseEntity<Category> getCategory(@PathVariable int id) {

        Category cat = categories.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
        // Critério para o filtro

        return ResponseEntity.ok(cat);

    }

    // Pega ID do Category
    @GetMapping("categories") // Endpoint
    // Pega todas as categorias
    public List<Category> getCategories() {

        return categories;
    }

}