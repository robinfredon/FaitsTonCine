package org.sid.InterfaceDao;

import org.sid.entities.Idee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdeeRepository extends JpaRepository<Idee, Long> {

}
