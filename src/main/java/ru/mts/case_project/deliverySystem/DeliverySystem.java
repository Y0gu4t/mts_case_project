package ru.mts.case_project.deliverySystem;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import ru.mts.case_project.ordersystem.OrderSystem;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DeliverySystem {
        List<City> cities;
        @PostConstruct
        void citiesInit(){
            cities.add(new City("Москва"));
            cities.add(new City("Санкт-Петербург"));
            cities.add(new City("Новосибирск"));
            cities.add(new City("Екатеринбург"));
        }
        void doTask(OrderSystem order) throws InterruptedException {

            String cityName = cities.stream().map(City::getName).findFirst().orElse("");
            if (!cityName.isEmpty()){
               City cityWhere = cities.stream().filter(city -> city.getName().equals(cityName)).findFirst().get();
               cityWhere.getFreeCourier(order).deliverOrder();
            }
            else{
                System.out.println("Заказ не может быть доставлен");
            }
        };
}
