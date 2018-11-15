package org.sid.InterfaceDao;

import org.sid.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
