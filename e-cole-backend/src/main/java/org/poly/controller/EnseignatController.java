package org.poly.controller;

import org.poly.entities.Enseignant;
import org.poly.services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EnseignatController {
	
	
	@Autowired
	EnseignantService enseignantService;
	
    @RequestMapping(value = "/enseignants",method = RequestMethod.POST)
    public void addEnseignant(@RequestBody Enseignant enseignant){
        enseignantService.ajoutEnseignant(enseignant);
    }


}
