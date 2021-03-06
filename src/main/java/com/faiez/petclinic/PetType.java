package com.faiez.petclinic;

import java.io.*;
import java.util.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.apache.openjpa.jdbc.meta.ReverseMappingTool$AnnotatedCodeGenerator
 */
@Entity
@Table(name="pet_type")
public class PetType {
	@Id
	@GeneratedValue
	@Column(columnDefinition="INT")
	private int id;

	@Basic
	@Column(length=30)
	private String name;

	@OneToMany(targetEntity=Pets.class, mappedBy="petType", cascade=CascadeType.MERGE)
	private Set<Pets> pets = new HashSet<Pets>();


	public PetType() {
	}

	public PetType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Pets> getPets() {
		return pets;
	}

	public void setPets(Set<Pets> pets) {
		this.pets = pets;
	}



}
