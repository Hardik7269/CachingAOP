package com.caching.aop.project.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class SalaryAccount {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long sId;

	private Long balance;
	
	@OneToOne
	@JoinColumn(name = "e_id")
	@JsonBackReference
	private Employee empSalary;
}
