package com.bress.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "title")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Title extends Base {
	
	@Column(name = "name", length = 45)
	private String name;

}
