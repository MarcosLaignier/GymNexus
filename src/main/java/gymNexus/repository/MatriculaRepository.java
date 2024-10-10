package gymNexus.repository;

import gymNexus.model.Matricula;
import gymNexus.utils.BaseCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends BaseCrudRepository<Matricula, Integer> {

}
