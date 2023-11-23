package com.shopecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopecommerce.entities.SaleOrderProducts;

@Repository 
public interface SaleOrderProductsRepo extends JpaRepository<SaleOrderProducts, Integer>{

}
