package ru.services.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
