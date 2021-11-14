package f1.com.manage.repositories;

import f1.com.manage.models.FanModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FanRepository extends JpaRepository<FanModel, Integer> {

    List<FanModel> findAll();
}
