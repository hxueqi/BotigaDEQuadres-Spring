package com.ITAcademy.Botiga;

public class PictureNotFoundException extends RuntimeException{
	
		public PictureNotFoundException(Long id) {
			super("Could not find picture " + id);
		}
}
