package com.example.SERVICE_CLIENT.repositories;

import com.example.SERVICE_CLIENT.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { }
