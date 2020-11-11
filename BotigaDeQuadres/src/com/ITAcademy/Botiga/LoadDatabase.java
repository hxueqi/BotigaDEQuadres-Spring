package com.ITAcademy.Botiga;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	
	@Bean
	CommandLineRunner initDatabase(ShopRepository shopRepository, PictureRepository pictureRepository) {
		return args ->{
			System.out.println("Preloading Data to memoryDatabase");
			Shop shop1 = new Shop("Joya verde", 3);
			shopRepository.save(shop1);
			Shop shop2 = new Shop("Joya rojo", 2);
			shopRepository.save(shop2);
			
			pictureRepository.save(new Picture("Jose", "Green land", "300", "10-02-2010", shop2));
			pictureRepository.save(new Picture("/", "Circle", "1000", "10-02-1996", shop1));
			pictureRepository.save(new Picture("Emily", "Mar", "1000", "10-02-1999", shop1));
			
			System.out.println("Data loaded");
		};
	}

}
