package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Client {

    @Id
    @GeneratedValue  // Auto-generate the ID
    private Long clientId;

    @Column(nullable = false)  // Store firstName in a database column
    private String firstName;

    @Column(nullable = false)  // Store lastName in a database column
    private String lastName;

    @ManyToOne  // Each client has one advisor
    @JoinColumn(name = "advisor_id")  // Store advisor reference
    private Advisor advisor;

    // Constructor with all variables (this sets up the object when we create a new one)
    public Client(String firstName, String lastName, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisor = advisor;
    }

    // Getter and Setter methods
    public Long getClientId() {
        return clientId;  // Get the client ID
    }

    public String getFirstName() {
        return firstName;  // Get the first name
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;  // Set the first name
    }

    public String getLastName() {
        return lastName;  // Get the last name
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;  // Set the last name
    }

    public Advisor getAdvisor() {
        return advisor;  // Get the advisor
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;  // Set the advisor
    }
}
