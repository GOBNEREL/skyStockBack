package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.CommandeFournisseur;
import com.blackfield.SkyStock.repository.CommandeFournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeFournisseurService {

    private final CommandeFournisseurRepository commandeFournisseurRepository;

    public CommandeFournisseurService(CommandeFournisseurRepository commandeFournisseurRepository) {
        this.commandeFournisseurRepository = commandeFournisseurRepository;
    }

    public CommandeFournisseur addCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        return commandeFournisseurRepository.save(commandeFournisseur);
    }

    public List<CommandeFournisseur> findAllCommandeFournisseurs() {
        return commandeFournisseurRepository.findAll();
    }

    public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
        return commandeFournisseurRepository.save(commandeFournisseur);
    }

    public void deleteCommandeFournisseur(Long id) {
        commandeFournisseurRepository.deleteById(id);
    }
}
