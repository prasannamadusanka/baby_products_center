package com.prasanna.employee_management_system.repository;

//import com.prasanna.employee_management_system.model.Product;
import com.prasanna.employee_management_system.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
