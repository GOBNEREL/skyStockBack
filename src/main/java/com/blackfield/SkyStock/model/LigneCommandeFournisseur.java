package com.blackfield.SkyStock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ligneCommandeFournisseur")
public class LigneCommandeFournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "article")
    private String article;

    @Column(name = "commandeFournisseur")
    private String commandeFournisseur;

    @Column(name = "quantiter")
    private Long quantiter;

    @Column(name = "prixunitaire")
    private Long prixunitaire;
}

