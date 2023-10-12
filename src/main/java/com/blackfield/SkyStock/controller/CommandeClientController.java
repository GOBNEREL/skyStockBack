package com.blackfield.SkyStock.controller;

import com.blackfield.SkyStock.model.CommandeClient;
import com.blackfield.SkyStock.model.CommandeFournisseur;
import com.blackfield.SkyStock.service.CommandeClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandeClient")
public class CommandeClientController {

    private final CommandeClientService commandeClientService;

    public CommandeClientController(CommandeClientService commandeClientService) {
        this.commandeClientService = commandeClientService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<CommandeClient>> getAllCommandeClients() {
        List<CommandeClient> commandeClients = commandeClientService.findAllCommandeClients();
        return new ResponseEntity<>(commandeClients, HttpStatus.OK);
    }

    @PostMapping("/add")
    public  ResponseEntity<CommandeClient> addCommandeClient(@RequestBody CommandeClient commandeClient) {
        CommandeClient newCommandeClient = commandeClientService.addCommandeClient(commandeClient);
        return new ResponseEntity<>(newCommandeClient, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<CommandeClient> updateCommandeClient(@RequestBody CommandeClient commandeClient) {
        CommandeClient updateCommandeClient = commandeClientService.updateCommandeClient(commandeClient);
        return new ResponseEntity<>(updateCommandeClient, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public  ResponseEntity<CommandeClient> deleteCommandeClient(@PathVariable("id") Long id) {
        commandeClientService.deleteCommandeFournisseur(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
