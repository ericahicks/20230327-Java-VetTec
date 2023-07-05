package com.skillstorm.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@CrossOrigin(origins = "*") // origins = "localhost:4200"
@RestController
@RequestMapping("/barbeque")
public class BarbequeController {

	// Inject the repository (I'm skipping the service layer)
	@Autowired
	private BarbequeRepo repo;

	@Operation(summary = "Gets all the barbeque items available",
			   description = "Finds the barbeque items for a restaurant's menu for"
			   		+ " an online ordering system. This description can be longer"
			   		+ " and more detailed than the summary.")
	@ApiResponse(responseCode = "200",
            description = "The response for the barbeque request",
            content = {
                    @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = 
                                       @Schema(implementation = Barbeque.class))
                    )}
	)
	@GetMapping
	public Iterable<Barbeque> findAll() {
		return repo.findAll();
	}
	
	// What is something I could search by to filter my results?
	@ApiResponse(responseCode = "200",
            description = "The response for the barbeque searched for by sauce type",
            content = {
                    @Content(
                            mediaType = "application/json",
                            array = @ArraySchema(schema = 
                                       @Schema(implementation = Barbeque.class))
                    )}
	)
	@GetMapping("/search") // localhost:8080/barbeque/search?sauce-type=bbq
	public Iterable<Barbeque> findBySearchTerm(
			 @Parameter(name = "sauce-type", // This is swagger documentation
    			required = true, description = "the sauce type that goes on the barbeque")
			@RequestParam(name = "sauce-type") String sauceType) { // this is spring annotation for the functionality
		return null; // TODO update Repository interface to have a findBySauceType method
	}
	

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Barbeque save(@RequestBody Barbeque data) {
		data.setId(null); // make sure jpa generates the id don't check if it
							// exists
		return repo.save(data);
	}

	// TODO delete mapping and put mapping

}
