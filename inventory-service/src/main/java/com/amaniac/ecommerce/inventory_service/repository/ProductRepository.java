package com.amaniac.ecommerce.inventory_service.repository;

import com.amaniac.ecommerce.inventory_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
