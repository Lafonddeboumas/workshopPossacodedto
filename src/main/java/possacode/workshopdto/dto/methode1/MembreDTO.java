package possacode.workshopdto.dto.methode1;

import lombok.Data;
import possacode.workshopdto.entity.Membre;

@Data
public class MembreDTO {



    private String nom;

    private String prenom;

    public static MembreDTO fromMembre(Membre membre){
        MembreDTO membreDTO = new MembreDTO();
        membreDTO.setNom(membre.getNom());
        membreDTO.setPrenom(membre.getPrenom());
        return membreDTO;
    }

    public static Membre fromMembreDTO(MembreDTO membreDTO){
        Membre membre = new Membre();
        membre.setNom(membreDTO.getNom());
        membre.setPrenom(membreDTO.getPrenom());
        return membre;
    }
}
