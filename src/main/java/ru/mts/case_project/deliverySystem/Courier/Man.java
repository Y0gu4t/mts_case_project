package ru.mts.case_project.deliverySystem.Courier;

public class Man extends CourierImpl{

    public Man() {
        this.capacity = 5;
        this.free = true;
        this.timeToDeliver  = 3;
    }
}
