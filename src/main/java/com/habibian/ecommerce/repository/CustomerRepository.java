package com.habibian.ecommerce.repository;

import com.habibian.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ali
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
