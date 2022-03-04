package com.habibian.ecommerce.repository;

import com.habibian.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Ali
 */
@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
    /**
     * find all products by category id and return as page
     *
     * @param id       (category id)
     * @param pageable (page number and page size)
     * @return (products as page)
     */
    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    /**
     * search for all products that contain searched name and return as page
     *
     * @param name     (product name)
     * @param pageable (page number and page size)
     * @return (products as page)
     */
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}
