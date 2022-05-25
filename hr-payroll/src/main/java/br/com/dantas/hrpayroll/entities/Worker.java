package br.com.dantas.hrpayroll.entities;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Worker implements Serializable{

	private static final long serialVersionUID = 1L;
	
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
	
}
