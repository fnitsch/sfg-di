package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.CatPetService;
import guru.springframework.sfgdi.services.DogPetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PetControllerTest {

    PetController dogPetController;
    PetController catPetController;


    @BeforeEach
    void setUp() {
        dogPetController = new PetController(new DogPetService());
        catPetController = new PetController(new CatPetService());
    }

    @Test
    void whichPetIsTheBest() {
        System.out.println(dogPetController.whichPetIsTheBest());
        System.out.println(catPetController.whichPetIsTheBest());
    }
}