package com.habibian.ecommerce.repository;

import com.habibian.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author Ali
 */
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product_category")
@CrossOrigin
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
