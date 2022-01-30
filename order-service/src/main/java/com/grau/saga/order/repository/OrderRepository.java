package com.grau.saga.order.repository;


import com.grau.saga.order.entities.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<PurchaseOrder, Integer>{

}
