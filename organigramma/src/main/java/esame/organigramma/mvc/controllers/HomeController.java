package esame.organigramma.mvc.controllers;

import esame.organigramma.mvc.entities.Organigramma;
import esame.organigramma.mvc.services.OrganigrammaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HomeController {
    @Autowired
    OrganigrammaService organigrammaService;
    @PostMapping("/")
    @ResponseBody
    public Organigramma nuovoOrganigramma(@RequestBody String nomi){
        System.out.println("nuovoOrganigramma "+nomi);

        return organigrammaService.createOrganigramma(nomi);
    }


}
