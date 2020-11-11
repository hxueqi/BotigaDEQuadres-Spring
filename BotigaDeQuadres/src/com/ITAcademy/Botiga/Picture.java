package com.ITAcademy.Botiga;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Picture {
	private @Id @GeneratedValue Long id;
	private String authorName;
	private String name;
	private String price;
	private String entryDate;
	@ManyToOne
	private Shop shop;
	
	
	

	@Override
	public String toString() {
		return "Picture{" +
				"authorName='"+ authorName + '\'' +
				", name='"+ name + '\'' + 
				", price='"+ price + '\'' +
				", entryDate='"+ entryDate + '\'' +
				'}';
	}
	
	public Picture(String authorName, String name, String price, String entryDate, Shop shop) {
		this.authorName = authorName;
		this.name = name;
		this.price = price;
		this.entryDate = entryDate;
		this.shop = shop;
	}
	
	public Picture () {
		
	}
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
		
	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
}
