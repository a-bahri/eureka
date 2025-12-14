package com.example.SERVICE_VOITURE.repositories;


import com.example.SERVICE_VOITURE.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

    // Récupérer toutes les voitures d’un client donné
    List<Voiture> findByClientId(Long id);
}
