package com.blackfield.SkyStock.controller;

import com.blackfield.SkyStock.model.LigneCommandeClient;
import com.blackfield.SkyStock.model.LigneCommandeFournisseur;
import com.blackfield.SkyStock.service.LigneCommandeClientService;
import com.blackfield.SkyStock.service.LigneCommandeFournisseurService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ligneCommandeClient")
public class LigneCommandeClientController {

    private final LigneCommandeClientService ligneCommandeClientService;

    public LigneCommandeClientController(LigneCommandeClientService ligneCommandeClientService) {
        this.ligneCommandeClientService = ligneCommandeClientService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<LigneCommandeClient>> getAllCommandeClients() {
        List<LigneCommandeClient> ligneCommandeClients = ligneCommandeClientService.findAllLigneCommandeClients();
        return new ResponseEntity<>(ligneCommandeClients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<LigneCommandeClient> addCommandeClient(@RequestBody LigneCommandeClient ligneCommandeClient) {
        LigneCommandeClient newLigneCommandeClient = ligneCommandeClientService.addLigneCommandeClient(ligneCommandeClient);
        return new ResponseEntity<>(newLigneCommandeClient, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<LigneCommandeClient> updateLigneCommandeClient(@RequestBody LigneCommandeClient ligneCommandeClient) {
        LigneCommandeClient updateLigneCommandeClient = ligneCommandeClientService.addLigneCommandeClient(ligneCommandeClient);
        return new ResponseEntity<>(updateLigneCommandeClient, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<LigneCommandeClient> deleteLigneCommandeClient(@PathVariable("id") Long id) {
        ligneCommandeClientService.deleteLigneCommandeClient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
