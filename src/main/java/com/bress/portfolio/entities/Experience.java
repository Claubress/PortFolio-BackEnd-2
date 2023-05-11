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
@Table(name = "experience")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Experience extends Base {
	
	@Column(name = "start", length = 45)
	private String start;

	@Column(name = "end", length = 45)
	private String end;
	
	@Column(name = "time_elapsed", length = 45)
	private String time_elapsed;
	
	@Column(name = "description", length = 400)
	private String description;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "company_id")
	private Company company;

	@ManyToOne(optional = false)
	@JoinColumn(name = "mode_id")
	private Mode mode;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "position_id")
	private Position position;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "person_id")
	private Person person;	
	
}
