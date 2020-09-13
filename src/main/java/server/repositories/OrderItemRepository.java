package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entities.Category;
import server.entities.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long >{
}
