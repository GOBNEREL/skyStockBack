package com.blackfield.SkyStock.controller;

import com.blackfield.SkyStock.model.CommandeFournisseur;
import com.blackfield.SkyStock.model.LigneCommandeFournisseur;
import com.blackfield.SkyStock.service.CommandeFournisseurService;
import com.blackfield.SkyStock.service.LigneCommandeFournisseurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligneCommandeFournisseur")
public class LigneCommandeFournisseurController {

    private final LigneCommandeFournisseurService ligneCommandeFournisseurService;

    public LigneCommandeFournisseurController(LigneCommandeFournisseurService ligneCommandeFournisseurService) {
        this.ligneCommandeFournisseurService = ligneCommandeFournisseurService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<LigneCommandeFournisseur>> getAllCommandeFournisseurs() {
        List<LigneCommandeFournisseur> ligneCommandeFournisseurs = ligneCommandeFournisseurService.findAllLigneCommandeFournisseurs();
        return new ResponseEntity<>(ligneCommandeFournisseurs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<LigneCommandeFournisseur> addCommandeFournisseur(@RequestBody LigneCommandeFournisseur ligneCommandeFournisseur) {
        LigneCommandeFournisseur newLigneCommandeFournisseur = ligneCommandeFournisseurService.addLigneCommandeFournisseur(ligneCommandeFournisseur);
        return new ResponseEntity<>(newLigneCommandeFournisseur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<LigneCommandeFournisseur> updateLigneCommandeFournisseur(@RequestBody LigneCommandeFournisseur ligneCommandeFournisseur) {
        LigneCommandeFournisseur updateLigneCommandeFournisseur = ligneCommandeFournisseurService.addLigneCommandeFournisseur(ligneCommandeFournisseur);
        return new ResponseEntity<>(updateLigneCommandeFournisseur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<LigneCommandeFournisseur> deleteLigneCommandeFournisseur(@PathVariable("id") Long id) {
        ligneCommandeFournisseurService.deleteLigneCommandeFournisseur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
