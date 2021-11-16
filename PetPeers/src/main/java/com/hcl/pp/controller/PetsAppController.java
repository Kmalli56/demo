package com.hcl.pp.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.pp.exception.PetPeersException;
import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.service.PetService;
import com.hcl.pp.service.UserService;
import com.hcl.pp.validator.LoginValidator;
import com.hcl.pp.validator.UserValidator;


@RestController
public class PetsAppController {

	@Autowired
	private UserService userService;

	@Autowired
	private PetService petService;

	private static final Logger logger = LogManager.getLogger(PetsAppController.class);

	@PostMapping("/user/login")
	public ResponseEntity<Object> loginUser(@Valid @RequestBody LoginValidator loginUser) throws PetPeersException {
		List<Pet> pets = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			pets = userService.loginUser(loginUser);
			if (pets != null) {
				logger.info("INFO [ LoginUser - User loggedin successfully ]");
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.ACCEPTED);
			} else {
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.NOT_FOUND);
			}
		} catch (PetPeersException e) {
			logger.error("User not found, please register...", e.getMessage());
			responseEntity = new ResponseEntity<Object>(new String("User not found, please register."),
					HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	@PostMapping("/user/add")
	public ResponseEntity<Object> addUser(@Valid @RequestBody UserValidator newUser) throws PetPeersException {
		ResponseEntity<Object> responseEntity = null;
		User user = null;
		try {
			user = userService.addUser(newUser);
			if (user != null) {
				logger.info("INFO [ AddUser - Added user successfully. ]");
				responseEntity = new ResponseEntity<Object>(user, HttpStatus.CREATED);
			} else {
				responseEntity = new ResponseEntity<Object>(new String("User already exists"), HttpStatus.CONFLICT);
			}
		} catch (PetPeersException e) {
			logger.error("Registration failed " + e.getMessage());
			responseEntity = new ResponseEntity<Object>(new String("User already exists, try with another..."),
					HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	@GetMapping("/pets")
	public ResponseEntity<Object> petHome() throws PetPeersException {
		List<Pet> pets = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			pets = petService.getAllPets();
			if (pets != null && pets.size() > 0) {
				logger.info("INFO [ PetHome - List of pets are created ]");
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.CREATED);
			} else {
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.EXPECTATION_FAILED);
			}
		} catch (PetPeersException e) {
			logger.error("Something went wrong!", e.getMessage());
		}
		return responseEntity;
	}

	@GetMapping("/pets/myPets/{userId}")
	public ResponseEntity<Object> myPets(@PathVariable Long userId) throws PetPeersException {
		User pets = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			pets = userService.getMyPets(userId);
			if (pets != null) {
				logger.info("INFO [ MyPets - List of my pets are found ]");
				if (pets.getPets().isEmpty()) {
					responseEntity = new ResponseEntity<Object>(new String("No pet is purchased by you."),
							HttpStatus.NOT_FOUND);
				} else {
					responseEntity = new ResponseEntity<Object>(pets, HttpStatus.FOUND);
				}
			} else {
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.NOT_FOUND);
			}
		} catch (PetPeersException e) {
			logger.error("UserId not found, please verify.", e.getMessage());
		}
		return responseEntity;
	}

	@GetMapping("/pets/petDetail/{petId}")
	public ResponseEntity<Object> petDetail(@PathVariable Long petId) throws PetPeersException {
		Optional<Pet> petDetail = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			petDetail = petService.getPetById(petId);
			if (petDetail != null) {
				logger.info("INFO [ PetDetails - Pets details are found ]");
				responseEntity = new ResponseEntity<Object>(petDetail, HttpStatus.FOUND);
			} else {
				responseEntity = new ResponseEntity<Object>(petDetail, HttpStatus.NOT_FOUND);
			}
		} catch (PetPeersException e) {
			logger.error("Not found pet details", e.getMessage());
			responseEntity = new ResponseEntity<Object>(new String("No pet is available with this id : " + petId),
					HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@PostMapping("/pets/addPet")
	public ResponseEntity<Object> addPet(@Valid @RequestBody Pet pet) throws PetPeersException {
		Pet pets = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			pets = petService.savePet(pet);
			if (pets != null) {
				logger.info("INFO [ AddPet - Added pet successfully ]");
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.CREATED);
			} else {
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.EXPECTATION_FAILED);
			}
		} catch (PetPeersException e) {
			logger.error("Pet is not added as expected", e.getMessage());
			responseEntity = new ResponseEntity<Object>(new String("Pet is not added"), HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	@PostMapping("/pets/buyPet/{petId}/{userId}")
	public ResponseEntity<Object> buyPet(@PathVariable Long petId, @PathVariable Long userId) throws PetPeersException {
		Pet pets = null;
		ResponseEntity<Object> responseEntity = null;
		try {
			pets = petService.buyPet(petId, userId);
			if (pets != null) {
				logger.info("INFO [ BuyPet - Purchased pet successfully ]");
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.CREATED);
			} else {
				responseEntity = new ResponseEntity<Object>(pets, HttpStatus.EXPECTATION_FAILED);
			}
		} catch (PetPeersException e) {
			logger.error("Cancelled purchase", e.getMessage());
			responseEntity = new ResponseEntity<Object>(new String("Pet purchase is cancelled"),
					HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	@GetMapping("/user/logout")
	public String logout() throws PetPeersException {
		return "Thank you, for choosing Pet Peers. Visit again.\nPlease provide your valuable feedback.";
	}

}
