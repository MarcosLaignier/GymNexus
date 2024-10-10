package gymNexus.utils;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseCrudRepository<T,ID> extends JpaRepository<T,ID> {
}
