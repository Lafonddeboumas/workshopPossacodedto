package possacode.workshopdto.service.serviceImpl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import possacode.workshopdto.dto.methode1.CotisationDTO;
import possacode.workshopdto.entity.Cotisation;
import possacode.workshopdto.repository.CotisationRepository;
import possacode.workshopdto.service.CotisationService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CotisationServiceImpl implements CotisationService {

    private final CotisationRepository cotisationRepository;

    @Override
    public CotisationDTO save(CotisationDTO cotisationDTO) {
       Cotisation cotisation = CotisationDTO.fromCotisationDTO(cotisationDTO);
       Cotisation saveCotisation = cotisationRepository.save(cotisation);
       return CotisationDTO.fromCotisation(saveCotisation);
    }

    @Override
    public List<CotisationDTO> findAll() {
        return cotisationRepository.findAll()
                .stream()
                .map(CotisationDTO::fromCotisation)
                .collect(Collectors.toList());
    }

    @Override
    public CotisationDTO findById(Integer id) {
       Cotisation cotisation = cotisationRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("No cotisation find with the provided id"+id));
        return CotisationDTO.fromCotisation(cotisation);
    }

    @Override
    public void deleteById(Integer id) {
        cotisationRepository.deleteById(id);
    }
}
