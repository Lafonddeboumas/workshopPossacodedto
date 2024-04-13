package possacode.workshopdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import possacode.workshopdto.entity.Adhesion;
import possacode.workshopdto.entity.Cotisation;

public interface AdhesionRepository extends JpaRepository<Adhesion, Integer> {
}
