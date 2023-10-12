package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.CommandeClient;
import com.blackfield.SkyStock.model.CommandeFournisseur;
import com.blackfield.SkyStock.repository.CommandeClientRepository;
import com.blackfield.SkyStock.repository.CommandeFournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeClientService {

    private final CommandeClientRepository commandeClientRepository;

    public CommandeClientService(CommandeClientRepository commandeClientRepository) {
        this.commandeClientRepository = commandeClientRepository;
    }

    public CommandeClient addCommandeClient(CommandeClient commandeClient) {
        return commandeClientRepository.save(commandeClient);
    }

    public List<CommandeClient> findAllCommandeClients() {
        return commandeClientRepository.findAll();
    }

    public CommandeClient updateCommandeClient(CommandeClient commandeClient) {
        return commandeClientRepository.save(commandeClient);
    }

    public void deleteCommandeFournisseur(Long id) {
        commandeClientRepository.deleteById(id);
    }
}
