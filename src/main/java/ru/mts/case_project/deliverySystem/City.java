package ru.mts.case_project.deliverySystem;

import ru.mts.case_project.deliverySystem.Courier.*;
import ru.mts.case_project.ordersystem.OrderSystem;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class City {
    public String getName() {
        return name;
    }

    String name;
    List<Courier> courierList = new ArrayList<>(10);

    public City(String  name) {
        this.name = name;

        for (int i = 0; i < 2; i++) {
            courierList.add(new Auto());
        }
        for (int i = 0; i < 3; i++) {
            courierList.add(new Velo());
        }
        for (int i = 0; i < 5; i++) {
            courierList.add(new Man());
        }
    }
    CourierImpl getFreeCourier(OrderSystem orderSystem){
        return courierList.stream().filter(courier -> );
    }
}
