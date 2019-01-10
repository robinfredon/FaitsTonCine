package org.sid.service;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.sid.InterfaceDao.IdeeMotsCleRepository;
import org.sid.InterfaceDao.IdeeRepository;
import org.sid.InterfaceDao.MotsCleeRepository;
import org.sid.entities.Genre;
import org.sid.entities.Idee;
import org.sid.entities.MotsCle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rita.RiMarkov;

@RestController
public class IdeeService {
	@Autowired
	private IdeeRepository ideeRepository;
	@Autowired
	private MotsCleeRepository motcleeRepository;
	@Autowired
	private IdeeMotsCleRepository  ideeMotsCleRepository;
	
	 RiMarkov rm = new RiMarkov(3);
	StringBuilder sb = new StringBuilder();
	
	@RequestMapping(value="/idees", method= RequestMethod.POST)
	public Idee SaveIdee(@Valid @RequestBody Idee i ){
		System.out.println(i.getIdee()+"    gnere"+i.getGenre().getGenre());
		System.out.println("les mots clé"+i.getIdeeMotcles());
		return ideeRepository.save(i);
		
	}
	
	@RequestMapping(value="/idees", method=RequestMethod.GET)
	public List<Idee> getIdees(){
		return ideeRepository.findAll();
	}
	
	@RequestMapping(value="/idees/{id}", method=RequestMethod.GET)
	public Idee getIdee(@PathVariable Long id){
		
		return ideeRepository.findById(id).orElse(null);
		
	}
	//permet de generer des nouvelles idées à partir des idées existants
	@RequestMapping(value="/idees/ideesByidee", method=RequestMethod.GET)
	public String[] generateIdee(){
		
		for (String s :ideeRepository.getIdeeByidee())
		{
//		    sb.append(s);
//		    sb.append("\n");
			 rm.loadText(s+" ");
		}	     
	   	 
	  
		return  rm.generateSentences(3);
		
	}
	
	// permet de generer des idés de meme genre
	
	@RequestMapping(value="/idees/ideesByGenre", method=RequestMethod.GET)
	public String[] generateIdeeByGenre(@RequestParam("g") Long g ){
		
		for (String s :ideeRepository.getIdeeByGenre(g))
		{
		    sb.append(s);
		    sb.append("\n");
		}	     
	   	  rm.loadText(sb.toString());
	 
		return  rm.generateSentences(3);
		
	}
	
	
	@RequestMapping(value="/motscle", method= RequestMethod.POST)
	public MotsCle SaveMotcle(@Valid @RequestBody MotsCle i ){
		
		return motcleeRepository.save(i);
		
	}
	
	@RequestMapping(value="/motscle", method=RequestMethod.GET)
	public List<MotsCle> getMotscles(){
		return motcleeRepository.findAll();
	}
	
	@RequestMapping(value="/motscle/{id}", method=RequestMethod.GET)
	public MotsCle getMotcle(@PathVariable Long id){
		return motcleeRepository.findById(id).orElse(null);
		
	}
	

}
