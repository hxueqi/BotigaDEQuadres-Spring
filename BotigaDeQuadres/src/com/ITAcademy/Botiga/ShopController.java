package com.ITAcademy.Botiga;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ShopController {
	
	private final ShopRepository repository;
	
	ShopController(ShopRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/shops")
	List<Shop> all(){
		return repository.findAll();
	}
	
	@PostMapping("/shops")
	Shop newStore(@RequestBody Shop newStore) {
		return repository.save(newStore);
	}
}
