package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entities.Category;
import server.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long >{
}
