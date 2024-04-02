package com.ShopeEase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ShopeEase.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
