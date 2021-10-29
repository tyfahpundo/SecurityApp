package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Cards;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards,Long> {
    List<Cards> findByCustomerId(Long id);
}
