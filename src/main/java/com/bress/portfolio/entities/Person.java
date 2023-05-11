package com.bress.portfolio.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person extends Base {
	
	@Column(name = "name", length = 45)
	private String name;
	
	@Column(name = "photo", length = 2048)
	private String photo; 
	
	@Column(name = "about", length = 1000)
	private String about;
	
	@Column(name = "facebook", length = 60)
	private String facebook;
	
	@Column(name = "twitter", length = 60)
	private String twitter;
	
	@Column(name = "instagram", length = 60)
	private String instagram;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "position_id")
	private Position position;
 
	@ManyToOne(optional = false)
	@JoinColumn(name = "city_id")
	private City city;
	

	/*

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "person_experience",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "experience_id")
	)
	private List<Experience> experiences = new ArrayList<Experience>();

		
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "person_education",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "education_id")
	)
	private List<Education> educations = new ArrayList<Education>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "person_skill",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "skill_id")
	)
	private List<Skill> skills = new ArrayList<Skill>();

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinTable(
			name = "person_project",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "project_id")
	)
	private List<Project> projects = new ArrayList<Project>();

    */
}
