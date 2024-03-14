package ru.mts.case_project.repository;

import ru.mts.case_project.entity.IngredientOrder;

public interface IngredientRepository {

    void add(IngredientOrder ingredientOrder);

    boolean remove(IngredientOrder ingredientOrder);
}
