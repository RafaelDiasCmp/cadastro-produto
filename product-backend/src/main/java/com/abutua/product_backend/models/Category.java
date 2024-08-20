package com.abutua.product_backend.models;

public class Category {
    
    // Atributos para a classe categoria
    private int id;
    private String name;
    
    //Gerar construtores: vazios e completos
    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }
    


    public Category() {
    }



    //Gerar Get e Set
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}