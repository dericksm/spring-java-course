package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entities.Category;
import server.entities.Order;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long >{
}
