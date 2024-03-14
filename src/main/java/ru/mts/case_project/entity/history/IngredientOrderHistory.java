package ru.mts.case_project.entity.history;

import ru.mts.case_project.entity.Ingredient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "ingredient_order_history")
public class IngredientOrderHistory {

    @Id
    @Column(name = "order_id")
    private long ingredientOrderId;

    private Ingredient ingredientType;

    private int amount;

    @Column(name = "order_date")
    private Date orderDate;
}
