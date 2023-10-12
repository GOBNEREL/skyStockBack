package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.LigneCommandeClient;
import com.blackfield.SkyStock.model.LigneCommandeFournisseur;
import com.blackfield.SkyStock.repository.LigneCommandeClientRepository;
import com.blackfield.SkyStock.repository.LigneCommandeFournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeClientService {

    private final LigneCommandeClientRepository ligneCommandeClientRepository;

    public LigneCommandeClientService(LigneCommandeClientRepository ligneCommandeClientRepository) {
        this.ligneCommandeClientRepository = ligneCommandeClientRepository;
    }

    public LigneCommandeClient addLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
        return ligneCommandeClientRepository.save(ligneCommandeClient);
    }

    public List<LigneCommandeClient> findAllLigneCommandeClients() {
        return ligneCommandeClientRepository.findAll();
    }

    public void deleteLigneCommandeClient(Long id) {
        ligneCommandeClientRepository.deleteById(id);
    }
}
