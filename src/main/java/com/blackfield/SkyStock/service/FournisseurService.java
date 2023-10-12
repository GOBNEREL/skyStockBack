package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.Client;
import com.blackfield.SkyStock.model.Fournisseur;
import com.blackfield.SkyStock.repository.ClientRepository;
import com.blackfield.SkyStock.repository.FournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {

    private final FournisseurRepository fournisseurRepository;

    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    public Fournisseur addFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    public List<Fournisseur> findAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public Fournisseur updateFournisseur(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur );
    }

    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }
}
