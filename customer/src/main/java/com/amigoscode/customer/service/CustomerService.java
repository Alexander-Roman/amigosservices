package com.amigoscode.customer.service;

import com.amigoscode.customer.model.Customer;
import com.amigoscode.customer.model.CustomerRegistrationRequest;
import com.amigoscode.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest request) {
        var customer = Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
        //TODO: Map with MapStruct
        //TODO: Validate email
        //TODO: Check email for being taken already
        customerRepository.save(customer);
    }

}
