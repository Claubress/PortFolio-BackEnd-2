package com.bress.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Project extends Base {

	@Column(name = "title", length = 45)
	private String title;	

	@Column(name = "description", length = 400)
	private String description;	

	@Column(name = "image", length = 2048)
	private String image;	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "person_id")
	private Person person;

}
