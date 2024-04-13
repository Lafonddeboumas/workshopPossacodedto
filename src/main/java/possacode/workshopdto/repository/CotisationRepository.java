package possacode.workshopdto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import possacode.workshopdto.entity.Cotisation;

public interface CotisationRepository extends JpaRepository<Cotisation, Integer> {
}
