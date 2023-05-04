package com.simplilearn.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.demo.entity.CartsAndOrders;
@Repository
public interface CartsandOrdersRepo  extends JpaRepository<CartsAndOrders,Long> {

}
