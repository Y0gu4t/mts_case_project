package ru.mts.case_project.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.mts.case_project.entity.IngredientOrder;
import ru.mts.case_project.repository.IngredientRepositoryImpl;

@Service
public class IngredientOrderServiceImpl {

    Logger logger = LogManager.getLogger();

    IngredientRepositoryImpl ingredientRepositoryImpl;

    public IngredientOrderServiceImpl(IngredientRepositoryImpl ingredientRepositoryImpl) {
        this.ingredientRepositoryImpl = ingredientRepositoryImpl;
    }

    public void process(IngredientOrder ingredientOrder) throws InterruptedException {
        logger.info("Processing {} purchase", ingredientOrder.getType());
        ingredientRepositoryImpl.add(ingredientOrder);
        Thread.sleep(ingredientOrder.getType().getTime());
    }
}
