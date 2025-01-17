package com.example.jpa.customer;

public record CustomerResponseDto (
        Long customerId,
        String username,
        String nickname
){

    public static CustomerResponseDto of(Customer customer) {
        return new CustomerResponseDto(
                customer.getId(),
                customer.getUsername(),
                customer.getNickname());
    }
}
