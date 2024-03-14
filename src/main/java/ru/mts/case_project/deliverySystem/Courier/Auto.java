package ru.mts.case_project.deliverySystem.Courier;

public class Auto extends CourierImpl{

    public Auto() {
        this.capacity = 10;
        this.free = true;
        this.timeToDeliver  = 1;
    }
}
