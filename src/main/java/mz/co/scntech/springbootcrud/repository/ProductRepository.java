package mz.co.scntech.springbootcrud.repository;

import mz.co.scntech.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sidónio Goenha on 9/28/2020
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
