package com.caching.aop.project.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long eId;
	
	
	@ManyToOne
	@JoinColumn(name = "d_id")
	private Department dept;
	
	@OneToOne(mappedBy = "empSalary")
	@JsonManagedReference
	private SalaryAccount salaryAccount;
	
}
