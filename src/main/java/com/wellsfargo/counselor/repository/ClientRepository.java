package com.wellsfargo.counselor.repository;

import com.wellsfargo.counselor.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    // Custom query method to find clients by their first name
    List<Client> findByFirstName(String firstName);

    // Custom query method to find clients by their last name
    List<Client> findByLastName(String lastName);

    // Custom query method to find clients by both first name and last name
    List<Client> findByFirstNameAndLastName(String firstName, String lastName);

    // You can add more query methods as needed
}
