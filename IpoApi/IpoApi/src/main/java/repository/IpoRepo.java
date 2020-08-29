package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ipoentity.Ipo;

@Repository
public interface IpoRepo extends JpaRepository<Ipo,Long> {

}
