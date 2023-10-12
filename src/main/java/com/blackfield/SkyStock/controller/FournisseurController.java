package com.blackfield.SkyStock.controller;

import com.blackfield.SkyStock.model.Client;
import com.blackfield.SkyStock.model.Fournisseur;
import com.blackfield.SkyStock.service.ClientService;
import com.blackfield.SkyStock.service.FournisseurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class FournisseurController {

    private final FournisseurService fournisseurService;

    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Fournisseur>> getAllFournisseurs() {
        List<Fournisseur> fournisseurs = fournisseurService.findAllFournisseurs();
        return new ResponseEntity<>(fournisseurs, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<Fournisseur> addFournisseur(@RequestBody Fournisseur fournisseur) {
        Fournisseur newFournisseur = fournisseurService.addFournisseur(fournisseur);
        return new ResponseEntity<>(newFournisseur, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Fournisseur> updateFournisseur(@RequestBody Fournisseur fournisseur) {
        Fournisseur updateFournisseur = fournisseurService.updateFournisseur(fournisseur);
        return new ResponseEntity<>(updateFournisseur, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<Fournisseur> deleteFournisseur(@PathVariable("id") Long id) {
        fournisseurService.deleteFournisseur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
