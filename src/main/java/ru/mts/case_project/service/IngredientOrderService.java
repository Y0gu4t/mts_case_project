package ru.mts.case_project.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import ru.mts.case_project.entity.IngredientOrder;
import ru.mts.case_project.repository.IngredientRepository;

@Service
public class IngredientOrderService {

    Logger logger = LogManager.getLogger();

    IngredientRepository ingredientRepository;

    public IngredientOrderService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public void process(IngredientOrder ingredientOrder) throws InterruptedException {
        logger.info("Processing {} purchase", ingredientOrder.getType());
        ingredientRepository.add(ingredientOrder);
        Thread.sleep(ingredientOrder.getType().getTime());
    }
}
