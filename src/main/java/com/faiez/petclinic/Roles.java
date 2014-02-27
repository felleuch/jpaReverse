package com.faiez.petclinic;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="roles")
public class Roles {
	@Id
	@Column(columnDefinition="INT")
	@GeneratedValue
	private int id;

	@Basic
	@Column(nullable=false, length=20)
	private String role;

	@ManyToMany(targetEntity=Users.class, cascade=CascadeType.MERGE)
	@JoinTable(name="user_roles", joinColumns=@JoinColumn(name="role_id", columnDefinition="INT", nullable=false), inverseJoinColumns=@JoinColumn(name="user_id", columnDefinition="INT"))
	private List<Users> users = new ArrayList<Users>();


	public Roles() {
	}

	public Roles(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}



}