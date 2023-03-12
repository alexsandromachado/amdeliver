package com.alexsandro.amdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsandro.amdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
