package possacode.workshopdto.service;

import possacode.workshopdto.entity.Adhesion;

import java.util.List;

public interface AdhesionService extends AbstractService<Adhesion>{

    List<Adhesion> findByTYpeAdhesion(String typeAdhesion);
}
