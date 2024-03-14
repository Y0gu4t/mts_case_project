package ru.mts.case_project.deliverySystem.Courier;

public abstract class CourierImpl implements Courier {
    int capacity;
    int timeToDeliver;
    boolean free;
    @Override
    public void deliverOrder() throws InterruptedException {
        Thread.sleep(timeToDeliver);
    }

    public int getCapacity() {
        return capacity;
    }
    public int getTimeToDeliver() {
        return timeToDeliver;
    }

    public boolean isFree() {
        return free;
    }
}
