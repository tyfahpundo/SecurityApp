package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Authorities;

public interface AuthoritiesRepository extends JpaRepository<Authorities,Long> {
}
