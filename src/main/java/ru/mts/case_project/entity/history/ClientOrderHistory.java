package ru.mts.case_project.entity.history;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client_order_history")
public class ClientOrderHistory {

    @Id
    @Column(name = "client_order_id")
    private long clientOrderId;

    @Column(name = "order_data")
    private int orderData;

    @Column(name = "order_processing_time")
    private long orderProcessingTime;

    @Column(name = "order_delivery_flag")
    private boolean orderDeliveryFlag;
}
