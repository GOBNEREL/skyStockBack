package com.blackfield.SkyStock.repository;

import com.blackfield.SkyStock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository  extends JpaRepository<CommandeClient, Long> {
}
