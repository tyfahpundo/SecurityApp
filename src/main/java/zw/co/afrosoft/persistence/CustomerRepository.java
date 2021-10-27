package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Customer;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByEmail(String email);
}
