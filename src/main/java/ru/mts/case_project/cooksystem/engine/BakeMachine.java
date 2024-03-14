package ru.mts.case_project.cooksystem.engine;

public class BakeMachine extends AbstractMachine {
    private int capacity;

    public BakeMachine(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
