package f1.com.manage.repositories;

import f1.com.manage.models.PiloteModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PiloteRepository extends JpaRepository<PiloteModel, Integer> {

    List<PiloteModel> findAll();
}
