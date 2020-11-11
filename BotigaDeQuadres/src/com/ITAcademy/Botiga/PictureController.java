package com.ITAcademy.Botiga;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PictureController {
private final PictureRepository repository;
	
	PictureController(PictureRepository repository){
		this.repository = repository;
	}
	
	@GetMapping("/shops/{id}/pictures")
	List<Picture> all(@PathVariable Long id){
		return repository.getPicturesByShopId(id);
	}
	
	@PostMapping("/shops/{id}/pictures")
	Picture newPicture(@RequestBody Picture newPicture) {
		return repository.save(newPicture);
	}
	
	@DeleteMapping("/shops/{id}/pictures")
	  void deletePicture() {
	    repository.deleteAll();
	}
}
