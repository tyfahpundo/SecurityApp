package zw.co.afrosoft.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.afrosoft.domain.Users;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
