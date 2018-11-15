package org.sid.service;

import javax.validation.Valid;

import org.sid.InterfaceDao.IdeeRepository;
import org.sid.entities.Idee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeeService {
	@Autowired
	private IdeeRepository ideeRepository;
	@RequestMapping(value="/idee", method= RequestMethod.POST)
	public Idee Save(@Valid @RequestBody Idee i ){
		return ideeRepository.save(i);
		
	}


}
