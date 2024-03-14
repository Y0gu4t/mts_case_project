package ru.mts.case_project.entity;

public enum Ingredient {
    DOUGH(1),
    MEAT(2),
    CABBAGE(2),
    FISH(3),
    BERRY(5),
    LEAF_TEA(2),
    COFFEE_BOB(2);

    Ingredient(int time) {
        this.time = time;
    }

    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
