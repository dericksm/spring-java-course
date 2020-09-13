package server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.entities.Order;
import server.entities.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long >{
}
