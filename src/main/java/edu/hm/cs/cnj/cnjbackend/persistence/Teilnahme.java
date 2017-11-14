package edu.hm.cs.cnj.cnjbackend.persistence;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class Teilnahme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(length=255)
	@NotNull
	private String name;
	
	@Min(0)
	@Max(20)
	private int begleiter;
	
	@Enumerated(EnumType.STRING)
	private TeilnahmeStatus status = TeilnahmeStatus.OFFEN;
	
	@ManyToOne
	@NotNull
	private Veranstaltung veranstaltung;
	
	public Teilnahme() {
	// Default-Konstruktor fuer JPA
	}
	
	public Teilnahme(String name, int begleiter) {
		this.name = name;
		this.begleiter = begleiter;
	}
	
	public Long getId() {
		return id;
	}
	
	void setVeranstaltung(Veranstaltung veranstaltung) {
		this.veranstaltung = veranstaltung;
	}

}

