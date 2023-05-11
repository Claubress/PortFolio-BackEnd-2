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
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class City extends Base {
	
	@Column(name = "name", length = 45)
	private String name;	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "state_id")
	private State state;

}
