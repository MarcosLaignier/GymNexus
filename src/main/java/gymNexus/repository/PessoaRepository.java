package gymNexus.repository;

import gymNexus.model.Pessoa;
import gymNexus.utils.BaseCrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends BaseCrudRepository<Pessoa, Integer> {

}
