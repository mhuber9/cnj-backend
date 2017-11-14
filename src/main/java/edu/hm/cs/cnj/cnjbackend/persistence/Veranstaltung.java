package edu.hm.cs.cnj.cnjbackend.persistence;

import javax.persistence.*;

@Entity
public class Veranstaltung {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	public Veranstaltung() {
	// JPA benoetigt Default-Konstruktor
	}
	
	public Long getId() {
		return id;
	}
}

