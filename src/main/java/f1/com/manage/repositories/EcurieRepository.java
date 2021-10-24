package f1.com.manage.repositories;

import f1.com.manage.models.EcurieModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EcurieRepository extends JpaRepository<EcurieModel, Integer> {

    List<EcurieModel> findAll();

}
