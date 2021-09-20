package com.test.springapiusingjpa.dao;

import com.test.springapiusingjpa.domain.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<orders, Integer> {
    @Query(value = "SELECT * FROM orders WHERE oid = ?", nativeQuery = true)
    List<orders> findByOrdersOid(Integer oid);
}
