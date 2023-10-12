package com.blackfield.SkyStock.service;

import com.blackfield.SkyStock.model.LigneCommandeFournisseur;
import com.blackfield.SkyStock.repository.LigneCommandeFournisseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneCommandeFournisseurService {

    private final LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;

    public LigneCommandeFournisseurService(LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository) {
        this.ligneCommandeFournisseurRepository = ligneCommandeFournisseurRepository;
    }

    public LigneCommandeFournisseur addLigneCommandeFournisseur(LigneCommandeFournisseur ligneCommandeFournisseur) {
        return ligneCommandeFournisseurRepository.save(ligneCommandeFournisseur);
    }

    public List<LigneCommandeFournisseur> findAllLigneCommandeFournisseurs() {
        return ligneCommandeFournisseurRepository.findAll();
    }

    public void deleteLigneCommandeFournisseur(Long id) {
        ligneCommandeFournisseurRepository.deleteById(id);
    }
}
