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
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Skill extends Base {

	@Column(name = "name", length = 45)
	private String name;
	
	@Column(name = "advance")
	private int advance;	

	@ManyToOne(optional = false)
	@JoinColumn(name = "person_id")
	private Person person;

}
