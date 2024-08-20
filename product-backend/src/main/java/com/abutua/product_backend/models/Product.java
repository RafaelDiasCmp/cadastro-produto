package com.abutua.product_backend.models;

// Guarda info de um produto
public class Product { // Todos no projeto enxergam a classe
    
    // Atributos == Informações que o objeto PRODUTO precisa guardar
    // Objetos são construídos a partir de uma classe

    // Atributos
    private int id;
    private String name; // PRIVATE == Somente são vistos dentro da própria classe
    private String description;
    private int idCategory;
    private boolean promotion;
    private boolean newProduct;
    private double price; // Não visíveis fora da classe produto

    //Métodos Construtores
    public Product(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
        
    }

    public Product(int id, String name, String description, int idCategory, boolean promotion, boolean newProduct,
            double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.idCategory = idCategory;
        this.promotion = promotion;
        this.newProduct = newProduct;
        this.price = price;
    }

    public Product(){
        
    }
    


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    // Métodos
    public int getId() { // Leitura = GET
        return id;
    }
    public void setId(int id) {// Altera/Gravação = SET
        this.id = id; // Precisa do THIS pelo uso com PARÂMETRO
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
