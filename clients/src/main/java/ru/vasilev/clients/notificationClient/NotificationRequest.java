package ru.vasilev.clients.notificationClient;

public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerName,
        String message
) {}