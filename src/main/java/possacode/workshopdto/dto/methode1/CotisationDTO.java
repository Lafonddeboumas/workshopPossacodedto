package possacode.workshopdto.dto.methode1;

import lombok.Data;
import possacode.workshopdto.entity.Cotisation;


@Data
public class CotisationDTO {

    //private Integer id;

    private double montant;

    private MembreDTO membreDTO;


    public static CotisationDTO fromCotisation(Cotisation cotisation){
        CotisationDTO cotisationDTO1 = new CotisationDTO();
       // cotisationDTO1.setId(cotisation.getId());
        cotisationDTO1.setMontant(cotisation.getMontant());
        cotisationDTO1.setMembreDTO(MembreDTO.fromMembre(cotisation.getMembre()));
        return cotisationDTO1;
    }

    public static Cotisation fromCotisationDTO(CotisationDTO cotisationDTO1){
        Cotisation cotisation = new Cotisation();
        //cotisation.setId(cotisation.getId());
        cotisation.setMontant(cotisationDTO1.getMontant());
        cotisation.setMembre(MembreDTO.fromMembreDTO(cotisationDTO1.getMembreDTO()));
        return cotisation;
    }
}
