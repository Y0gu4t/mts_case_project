package ru.mts.case_project.entity.history;

import ru.mts.case_project.entity.Ingredient;

import java.util.Date;

public class IngredientOrderHistory implements History {

    private long ingredientOrderId;

    private Ingredient ingredientType;

    private int amount;

    private Date orderDate;
}
