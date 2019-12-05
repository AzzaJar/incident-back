package com.example.demo.controller;

import com.example.demo.persistance.entities.Incident;
import com.example.demo.services.IncidentService;
import com.example.demo.persistance.entities.Secteur;
import com.example.demo.services.SecteurService;
import com.example.demo.utils.CustomFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping (value = "Incident")
@CrossOrigin("*")
@RestController
public class IncidentController {
    @Autowired
    IncidentService incidentService;
    @Autowired
    private SecteurService secteurService;

    @PostMapping(value = "/query")
    public List<Incident> query(@RequestBody CustomFilter customFilter) {
        List<Incident> result = incidentService.findByQueryCM(customFilter);
        return result;
    }

    @PostMapping(value = "/{condition}_query")
    public List<Incident> query(@RequestBody CustomFilter customFilter, @PathVariable("condition") String condition) {
        List<Incident> result = incidentService.findByQueryBonus(customFilter, condition);
        return result;
    }

    @PostMapping(value = "/findByQuery")
    public List<Incident> findByQuery(@RequestParam("field") String field,
                                      @RequestBody() Object value) {
        return incidentService.findByQuery(field, value);
    }

    @PostMapping(value = "/findBySecQuery")
    public List<Incident> findBySec(@RequestParam("field") String field,
                                    @RequestBody Secteur value) {
        System.out.println("waaait");
        return incidentService.findByQuery(field, value);
    }


    @GetMapping(value = "/find")
    public List<Incident> findAll(){
        return incidentService.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public Incident findByID (@PathVariable long id ){
        return incidentService.findByID(id);
    }



    @GetMapping(value = "/find/secteur/{id}")
    public List<Incident> findSecteur(@PathVariable long id) {
        Secteur secteur= secteurService.findByID(id);

        return incidentService.findBySecteur(secteur);
    }
    @PostMapping(value = "/")
    public void save(Incident incident){

        incidentService.save(incident);
    }
    @GetMapping(value = "/delete/{ID}")
    public String deleteByID (@PathVariable long ID) {

        incidentService.deleteByID(ID);
        return  "deleted success" ;}

    @PatchMapping("/update")//replace an existing Resource entirely  // @PatchMapping partial update
    public String update(@RequestBody Incident incident) {
        /*Laureat dblaureat = laureatService.findByID(laureat.getid());
        dblaureat.setNom(laureat.getNom());
        dblaureat.setPrenom(laureat.getPrenom());*/
        incidentService.save(incident);
        return "updated  success";
    }

}
