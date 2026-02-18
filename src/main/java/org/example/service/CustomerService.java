package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.dto.SignupRequest;
import org.example.model.dto.User;
import org.example.model.entity.CustomerEntity;
import org.example.model.entity.UserEntity;
import org.example.repository.CustomersRepository;
import org.example.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomersRepository customerRepository;
    private final UserRepository userRepository;

    @Transactional
    public String register(SignupRequest signupRequest) {

        Optional<UserEntity> check = userRepository.findByEmail(signupRequest.getEmail());
        if (check.isEmpty()){
            CustomerEntity customer = new CustomerEntity();
            customer.setFirstName(signupRequest.getFirstName());
            customer.setSecondName(signupRequest.getSecondName());
            customer.setNic(signupRequest.getNic());
            customer.setEmail(signupRequest.getEmail());
            customer.setPhone(signupRequest.getPhone());

            CustomerEntity savedCustomer = customerRepository.save(customer);

            UserEntity user = new UserEntity();
            user.setEmail(signupRequest.getEmail());
            user.setPassword(signupRequest.getPassword());

            userRepository.save(user);

            return "User Registered Successfully with Email: " + signupRequest.getEmail();
        }

        return "User all ready Registered with Email: ";
    }
}