package org.example.repository;

import org.example.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<CustomerEntity, Integer> {
}
