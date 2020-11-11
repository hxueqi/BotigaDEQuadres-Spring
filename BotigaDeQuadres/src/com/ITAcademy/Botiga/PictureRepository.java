package com.ITAcademy.Botiga;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;


public interface PictureRepository extends JpaRepository<Picture, Long >{

	@Query("select p from Picture p where p.shop.id = ?1")
	List<Picture> getPicturesByShopId(@PathVariable Long id);
}
