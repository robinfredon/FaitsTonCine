package org.sid.InterfaceDao;

import org.sid.entities.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioRepository extends JpaRepository<Scenario, Long> {

}
