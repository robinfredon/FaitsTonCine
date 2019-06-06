package org.sid.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.sid.InterfaceDao.PersonnageRepository;
import org.sid.entities.Idee;
import org.sid.entities.Personnage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.qos.logback.core.net.SyslogOutputStream;
import rita.RiMarkov;

public class PersonnageService {

	private PersonnageRepository personnageRepository;
	
	@RequestMapping(value="/personnage", method= RequestMethod.POST)
	public Personnage SavePersonnage(@Valid @RequestBody Personnage i ){
		return personnageRepository.save(i);
	}
	
	@RequestMapping(value="/personnage", method=RequestMethod.GET)
	public List<Personnage> getPersonnages(){
		return personnageRepository.findAll();
	}
	
	@RequestMapping(value="/personnage/{id}", method=RequestMethod.GET)
	public Personnage getPersonnage(@PathVariable Long id){
		return personnageRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/personnage/{id}", method=RequestMethod.PUT)
	public Personnage updateIdee(@RequestBody Personnage i){
		return personnageRepository.save(i);
	}
	
	
}
