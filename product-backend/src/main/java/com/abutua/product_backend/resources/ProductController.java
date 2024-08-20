package com.abutua.product_backend.resources;

import java.util.List;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abutua.product_backend.models.Product;


@RestController // Aceita requisições HTTP
public class ProductController {


    //Adaptações para suporte para interface já criada
    private List<Product> products = Arrays.asList( 
    new Product(1, "Product 01","Description 01,",1, false, false, 100.50), 
    new Product(2, "Product 02","Description 02,",2, true, true, 200.50), 
    new Product(3, "Product 03","Description 03,",3, false, true, 300.50) 
    );


    @GetMapping("products/{id}") // "products" == ENDPOINT

    // List == Classe PathVariable pega o ID que veio do endpoint
    public ResponseEntity<Product> getProduct(@PathVariable int id) { // Retorna RESPONSEENTITY para status code
                                                                      // correrto
        // (...) = PARÂMETRO

        // if(id <= products.size()){
        // 200 == MATURIDADE 2
        // return ResponseEntity.ok(products.get(id-1)); // Retorna um JSON
        // usuário pega id 1 === produto da lista na posição 0

        // }
        // else{
        // return ResponseEntity.notFound().build(); // 404 == MATURIDADE 2
        // throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not Found");
        // // Exceção
        // }

        Product prod = products.stream()
                                .filter(p -> p.getId() == id)
                                .findFirst()
                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found")); 
                                // Critério para o filtro

        return ResponseEntity.ok(prod);

    }

    // Pega ID do Products
    @GetMapping("products") // Endpoint

    public List<Product> getProducts() { // Método == getProducts

        // List <Product> listProd = new ArrayList<>(); // Variável listProd declarada
        // Construindo Objeto ArrayList

        return products;// listProducts;
    }
}
