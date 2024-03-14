package ru.mts.case_project.entity.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "delivery_history")
public class DeliveryHistory {

    @Id
    @Column(name = "delivery_id")
    private long deliveryId;

    @Column(name = "delivery_data")
    private int deliveryData;

    @Column(name = "delivery_time")
    private long deliveryTime;

    @Column(name = "delivery_courier_type")
    private int deliveryCourierType;
}
