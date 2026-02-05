package az.edu.ada.modules.module01.lecture03.repository;


import az.edu.ada.modules.module01.lecture03.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}