package ru.mts.case_project.ordersystem;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayDeque;
import java.util.Queue;

public class ScheduledOrder {
    Queue<OrderSystem> orders = new ArrayDeque<>();

    @Scheduled(fixedRate = 10000)
    public void orderInit(){
        orders.add(new OrderSystem());
    }
}
