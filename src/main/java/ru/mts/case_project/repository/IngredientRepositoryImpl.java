package ru.mts.case_project.repository;

import org.springframework.stereotype.Repository;
import ru.mts.case_project.entity.Ingredient;
import ru.mts.case_project.entity.IngredientOrder;

import java.util.Map;

@Repository
public class IngredientRepositoryImpl implements IngredientRepository {

    private Map<Ingredient, Integer> ingredients;

    public void add(IngredientOrder ingredientOrder) {
        ingredients.put(ingredientOrder.getType(),
                ingredients.get(ingredientOrder.getType()) + ingredientOrder.getAmount());
    }

    public boolean remove(IngredientOrder ingredientOrder) {
        int currentAmount = ingredients.get(ingredientOrder.getType());
        if (ingredientOrder.getAmount() - currentAmount < 0) {
            return false;
        }
        ingredients.put(ingredientOrder.getType(),
                ingredients.get(ingredientOrder.getType()) - ingredientOrder.getAmount());
        return true;
    }
}
