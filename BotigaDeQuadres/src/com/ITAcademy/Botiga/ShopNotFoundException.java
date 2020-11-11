package com.ITAcademy.Botiga;

public class ShopNotFoundException extends RuntimeException{
	public ShopNotFoundException(Long id) {
		super("Could not find shop " + id);
	}
}
