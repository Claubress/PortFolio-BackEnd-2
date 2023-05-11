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
@Table(name = "education")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Education extends Base {
	
	@Column(name = "start", length = 45)
	private String start;

	@Column(name = "end", length = 45)
	private String end;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "title_id")
	private Title title;

	@ManyToOne(optional = false)
	@JoinColumn(name = "school_id")
	private School school;

	@ManyToOne(optional = false)
	@JoinColumn(name = "person_id")
	private Person person;	
}
