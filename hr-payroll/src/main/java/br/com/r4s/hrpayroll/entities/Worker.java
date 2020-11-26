package br.com.r4s.hrpayroll.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Worker implements Serializable{
	
	private static final long serialVersionUID = -2948956321856541954L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
	public Worker() {
	}

	public Worker(Long id, String name, Double dailyIncome) {
		this.id = id;
		this.name = name;
		this.dailyIncome = dailyIncome;
	}
}
