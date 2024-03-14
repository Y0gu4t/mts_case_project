package ru.mts.case_project.cooksystem.repository;

import ru.mts.case_project.cooksystem.Recipe;
import ru.mts.case_project.cooksystem.service.CreateEngineSystem;

public class CookSystemRepositoryImpl implements CookSystemRepository {
    private Recipe recipe;
    private CreateEngineSystem createEngineSystem;

    public CookSystemRepositoryImpl(Recipe recipe, CreateEngineSystem createEngineSystem) {
        this.recipe = recipe;
        this.createEngineSystem = createEngineSystem;
    }

    public void cook() {

    }
}
