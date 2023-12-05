package org.sid.orderservice.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private double price;
    private int quantity;
}
