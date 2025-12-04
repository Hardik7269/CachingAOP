package com.caching.aop.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long dId;
	
	private String deptName;
	
	@OneToMany(mappedBy = "dept")
	private List<Employee> employees;
}
