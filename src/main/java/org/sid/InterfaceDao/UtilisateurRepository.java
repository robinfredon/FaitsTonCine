package org.sid.InterfaceDao;

import javax.validation.Valid;

import org.sid.entities.Idee;
import org.sid.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Long>{


}
