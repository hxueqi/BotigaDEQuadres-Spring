package com.ITAcademy.Botiga;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop {
	
	private @Id @GeneratedValue Long id;
	private String name;
	private Integer maxCapacity;
	
	public Shop() {}

	
	public Shop(String name, Integer maxCapacity) {
		this.name = name;
		this.maxCapacity = maxCapacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

}
