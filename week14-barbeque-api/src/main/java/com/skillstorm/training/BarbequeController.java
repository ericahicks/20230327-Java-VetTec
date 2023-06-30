package com.skillstorm.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // origins = "localhost:4200"
@RestController
@RequestMapping("/barbeque")
public class BarbequeController {
	
	// Inject the repository (I'm skipping the service layer)
	@Autowired
	private BarbequeRepo repo;
	
	@GetMapping
	public Iterable<Barbeque> findAll() {
		return repo.findAll();
	}
	
	@PostMapping
	public Barbeque save(@RequestBody Barbeque data) {
		data.setId(null); // make sure jpa generates the id don't check if it exists
		return repo.save(data);
	}
	
	// TODO delete mapping and put mapping

}
