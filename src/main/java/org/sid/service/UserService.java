package org.sid.service;

import java.util.List;

import javax.validation.Valid;

import org.sid.InterfaceDao.UtilisateurRepository;
import org.sid.entities.Idee;
import org.sid.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class UserService {
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	private String password; // ajout pour le login
	private String login;	// ajout pour le login 
	
	@RequestMapping(value="/users", method= RequestMethod.POST)
	public @Valid Utilisateur SaveUtilisateur(@Valid @RequestBody Utilisateur i ){
		return utilisateurRepository.save(i);
	}
	
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public List<Utilisateur> getUtilisateurs(){
		return utilisateurRepository.findAll();
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public Utilisateur getUtilisateur(@PathVariable Long id){
		return utilisateurRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@RequestBody Utilisateur i){
		return utilisateurRepository.save(i);
	}
	
	// LOGIN ***************************************************************
		
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public Utilisateur getLogin(){
		return utilisateurRepository.Connection(login, password);
	}
	
	
}
