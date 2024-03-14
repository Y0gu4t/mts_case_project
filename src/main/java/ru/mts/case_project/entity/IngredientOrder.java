package ru.mts.case_project.entity;

public class IngredientOrder {

    private Ingredient type;
    private int amount;

    public Ingredient getType() {
        return type;
    }

    public void setType(Ingredient type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
