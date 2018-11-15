package org.sid.InterfaceDao;

import org.sid.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long>  {

}
