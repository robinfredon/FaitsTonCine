package org.sid.InterfaceDao;

import org.sid.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long>  {

}
