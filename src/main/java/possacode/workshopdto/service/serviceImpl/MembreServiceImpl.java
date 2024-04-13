package possacode.workshopdto.service.serviceImpl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import possacode.workshopdto.dto.methode1.MembreDTO;
import possacode.workshopdto.entity.Membre;
import possacode.workshopdto.repository.MembreRepository;
import possacode.workshopdto.service.MembreService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MembreServiceImpl implements MembreService {

    private final MembreRepository membreRepository;

    @Override
    public MembreDTO save(MembreDTO membreDTO) {
        Membre membre = MembreDTO.fromMembreDTO(membreDTO);
        Membre saveMembre = membreRepository.save(membre);
        return MembreDTO.fromMembre(saveMembre);
    }

    @Override
    public List<MembreDTO> findAll() {
        List<Membre>  membres = membreRepository.findAll();
        return membres
                .stream()
                .map(MembreDTO::fromMembre)
                .collect(Collectors.toList());
    }

    @Override
    public MembreDTO findById(Integer id) {
        Membre membre  = membreRepository.findById(id).orElseThrow(()->new EntityNotFoundException("No membre find with the provided id"+id) );
        return MembreDTO.fromMembre(membre);
    }

    @Override
    public void deleteById(Integer id) {
        membreRepository.deleteById(id);
    }
}
