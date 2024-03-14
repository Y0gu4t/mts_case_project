package ru.mts.case_project.cooksystem;

import ru.mts.case_project.entity.Product;

import java.util.Map;

public class Recipe {
    private Product product;
    private Map<String, Integer> ingredients;

    public Recipe(Product product, Map<String, Integer> ingredients) {
        this.product = product;
        this.ingredients = ingredients;
    }

    public Product getProduct() {
        return product;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }
}
