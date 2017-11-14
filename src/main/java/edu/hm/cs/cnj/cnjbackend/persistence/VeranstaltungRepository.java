package edu.hm.cs.cnj.cnjbackend.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VeranstaltungRepository extends JpaRepository<Veranstaltung, Long> {
	
}
