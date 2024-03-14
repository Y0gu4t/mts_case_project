package ru.mts.case_project.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.mts.case_project.entity.IngredientOrder;
import ru.mts.case_project.service.IngredientOrderServiceImpl;

@Controller
public class IngredientOrderController {

    Logger logger = LogManager.getLogger();

    @Autowired
    IngredientOrderServiceImpl ingredientOrderServiceImpl;

    @PostMapping("/api/ingredients/purchase")
    public void purchase(@RequestBody IngredientOrder ingredientOrder) throws InterruptedException {
        logger.info("Start purchasing ingredients");
        for (int i = 0; i < ingredientOrder.getAmount(); i++) {
            ingredientOrderServiceImpl.process(ingredientOrder);
        }
    }
}
