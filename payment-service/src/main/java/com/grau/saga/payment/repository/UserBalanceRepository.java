package com.grau.saga.payment.repository;

import com.grau.saga.payment.entity.UserBalance;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserBalanceRepository extends JpaRepository<UserBalance, Integer> {
}
