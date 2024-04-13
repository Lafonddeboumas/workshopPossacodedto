package possacode.workshopdto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import possacode.workshopdto.dto.methode1.MembreDTO;
import possacode.workshopdto.entity.Membre;
import possacode.workshopdto.service.MembreService;

import java.util.List;

@RestController
@RequestMapping("/membre")
@RequiredArgsConstructor
public class MembreController {

    public final MembreService membreService;

    @PostMapping("/")
    public MembreDTO save(@RequestBody MembreDTO membreDTO){
      return membreService.save(membreDTO);
    }

    @GetMapping("/")
    public List<MembreDTO> findAll(){
        return membreService.findAll();
    }

    @GetMapping("/{id}")
    public MembreDTO findById(@PathVariable(name = "id") Integer id){
        return membreService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(name = "id") Integer id){
         membreService.deleteById(id);
    }

}
