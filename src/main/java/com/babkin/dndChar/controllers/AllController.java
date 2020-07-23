package com.babkin.dndChar.controllers;

import com.babkin.dndChar.models.Character;
import com.babkin.dndChar.data.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AllController {
    private CharacterRepository characterRepository;

    @Autowired
    public AllController(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        List<Character> characterList = new ArrayList<>();
        characterRepository.findAll().forEach(x -> characterList.add(x));
        model.addAttribute("characterList", characterList);
        return "all";
    }
}

