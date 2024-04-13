package possacode.workshopdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import possacode.workshopdto.entity.Membre;

public interface MembreRepository extends JpaRepository<Membre, Integer> {
}
