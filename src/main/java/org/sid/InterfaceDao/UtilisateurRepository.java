package org.sid.InterfaceDao;

import org.sid.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository  extends JpaRepository<Utilisateur, Long>{

}
