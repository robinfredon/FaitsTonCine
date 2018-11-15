package org.sid.InterfaceDao;
import org.sid.entities.Personnage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnageRepository extends JpaRepository<Personnage, Long> {

}
