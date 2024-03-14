package ru.mts.case_project.deliverySystem.Courier;

public class Velo extends CourierImpl {
    public Velo() {
        this.capacity = 5;
        this.free = true;
        this.timeToDeliver  = 2;
    }
}
