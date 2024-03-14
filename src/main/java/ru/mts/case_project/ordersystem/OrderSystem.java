package ru.mts.case_project.ordersystem;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.mts.case_project.entity.AbstractProduct;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


@Component
@Scope("prototype")
public class OrderSystem {
    private AbstractProduct product;
    private int numberProduct;
    private String city;
    private LocalDateTime timeOrder;
    private TypeDelivery typeDelivery;
    private Map<AbstractProduct,Integer> odder;


    public OrderSystem(AbstractProduct product, int numberProduct, String city, LocalDateTime timeOrder, TypeDelivery typeDelivery) {
        this.product = product; // нужно получать рандомный продукт
        this.numberProduct = numberProduct;
        this.city = city;
        this.timeOrder = timeOrder;
        this.typeDelivery = typeDelivery;
        this.odder = new HashMap<>(3);
    }
    public OrderSystem(){
        this.odder = new HashMap<>(3);
    }

    public AbstractProduct getProduct() {
        return product;
    }

    public void setProduct(AbstractProduct product) {
        this.product = product;
    }

    public int getNumberProduct() {
        return numberProduct;
    }

    public void setNumberProduct(int numberProduct) {
        this.numberProduct = numberProduct;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }

    public void setTimeOrder(LocalDateTime timeOrder) {
        this.timeOrder = timeOrder;
    }

    public TypeDelivery getTypeDelivery() {
        return typeDelivery;
    }

    public void setTypeDelivery(TypeDelivery typeDelivery) {
        this.typeDelivery = typeDelivery;
    }
}
