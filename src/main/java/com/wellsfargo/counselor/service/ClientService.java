package com.wellsfargo.counselor.service;

import com.wellsfargo.counselor.entity.Client;
import com.wellsfargo.counselor.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    // Constructor-based injection for the repository
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Method to save a client
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    // Method to get a client by ID
    public Client getClientById(Long clientId) {
        return clientRepository.findById(clientId).orElse(null);  // Return null if not found
    }

    // Method to delete a client
    public void deleteClient(Long clientId) {
        clientRepository.deleteById(clientId);
    }

    // Additional methods can be added as needed
}
