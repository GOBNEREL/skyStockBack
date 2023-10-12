package com.blackfield.SkyStock.controller;

import com.blackfield.SkyStock.model.Client;
import com.blackfield.SkyStock.model.CommandeFournisseur;
import com.blackfield.SkyStock.service.ClientService;
import com.blackfield.SkyStock.service.CommandeFournisseurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandeFournisseur")
public class CommandeµFournisseurController {

    private final CommandeFournisseurService commandeFournisseurService;

    public CommandeµFournisseurController(CommandeFournisseurService commandeFournisseurService) {
        this.commandeFournisseurService = commandeFournisseurService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<CommandeFournisseur>> getAllCommandeFournisseurs() {
        List<CommandeFournisseur> commandeFournisseurs = commandeFournisseurService.findAllCommandeFournisseurs();
        return new ResponseEntity<>(commandeFournisseurs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<CommandeFournisseur> addCommandeFournisseur(@RequestBody CommandeFournisseur commandeFournisseur) {
        CommandeFournisseur newCommandeFournisseur = commandeFournisseurService.addCommandeFournisseur(commandeFournisseur);
        return new ResponseEntity<>(newCommandeFournisseur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<CommandeFournisseur> updateCommandeFournisseur(@RequestBody CommandeFournisseur commandeFournisseur) {
        CommandeFournisseur updateCommandeFournisseur = commandeFournisseurService.updateCommandeFournisseur(commandeFournisseur);
        return new ResponseEntity<>(updateCommandeFournisseur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<CommandeFournisseur> deleteCommandeFournisseur(@PathVariable("id") Long id) {
        commandeFournisseurService.deleteCommandeFournisseur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
