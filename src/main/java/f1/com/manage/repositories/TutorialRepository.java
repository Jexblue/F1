package f1.com.manage.repositories;

import java.util.List;
import f1.com.manage.models.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    
    List<Tutorial> findByPublished(boolean published);
    
    List<Tutorial> findByTitleContaining(java.lang.String title);
    
    //List<Tutorial> findAll();
    
}
