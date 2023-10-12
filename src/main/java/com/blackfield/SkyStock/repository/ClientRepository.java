package com.blackfield.SkyStock.repository;

import com.blackfield.SkyStock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
