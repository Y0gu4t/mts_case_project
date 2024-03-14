package ru.mts.case_project.entity;

import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractProduct implements Product{
    protected int cookTime;

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }
}
