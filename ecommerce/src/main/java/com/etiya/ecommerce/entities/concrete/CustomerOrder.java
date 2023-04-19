package com.etiya.ecommerce.entities.concrete;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "customer_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "status_code")
    private String statusCode;

    @Column(name = "placed")
    private String placed;

    @Column(name = "paid")
    private String paid;

    @Column(name = "price")
    private String price;

    @Column(name = "details")
    private String details;


    @ManyToOne()
    @JoinColumn(name="customers_id")
    private Customer customer;

    @OneToMany(mappedBy = "customerOrderProduct")
    private List<CustomerOrderProduct> customerOrderProducts;

}