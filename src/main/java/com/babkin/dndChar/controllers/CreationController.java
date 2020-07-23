package com.babkin.dndChar.controllers;

import com.babkin.dndChar.models.Character;
import com.babkin.dndChar.models.User;
import com.babkin.dndChar.data.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CreationController {
    private CharacterRepository characterRepository;

    @Autowired
    public CreationController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @ModelAttribute(name = "character")
    public Character character(){
        return new Character();
    }

    @GetMapping("/sheet")
    public String showSomeSheet(@ModelAttribute Character character){
        return "sheet";
    }

    @PostMapping("/createCharacter")
    public String createCharacter(@Valid Character character,
                                  Errors errors,
                                  @AuthenticationPrincipal User user) {
        if(errors.hasErrors()){
            return "sheet";
        }

        character.setUser(user);

        characterRepository.save(character);

        return "redirect:/";
    }
}
