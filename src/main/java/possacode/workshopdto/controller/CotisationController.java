package possacode.workshopdto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import possacode.workshopdto.dto.methode1.CotisationDTO;
import possacode.workshopdto.entity.Cotisation;
import possacode.workshopdto.service.CotisationService;

import java.util.List;

@RestController
@RequestMapping("/cotisation")
@RequiredArgsConstructor
public class CotisationController {

    private final CotisationService cotisationService;


    @PostMapping("/")
    public CotisationDTO save(@RequestBody CotisationDTO cotisationDTO){
        return cotisationService.save(cotisationDTO);
    }

    @GetMapping("/")
    public List<CotisationDTO> findAll(){
        return cotisationService.findAll();
    }

    @GetMapping("/{id}")
    public CotisationDTO findById(@PathVariable(name = "id") Integer id){
        return cotisationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteByIdd(@PathVariable(name = "id") Integer id){
        cotisationService.deleteById(id);
    }
}
