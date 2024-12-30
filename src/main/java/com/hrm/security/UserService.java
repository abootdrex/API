/*package com.hrm.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	  @Autowired
    private final UserRepository userRepository;
	  @Autowired
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String registerUser(User user) {
        // Check if the username already exists
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            return "Username already exists!";
        }
        
        
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("USER");
        
        
        String accountNumber = generateUniqueAccountNumber();
        user.setAccountNumber(accountNumber);
        userRepository.save(user);

        return "User registered successfully!" + accountNumber;
    }
    private String generateUniqueAccountNumber() {
        String accountNumber;
        do {
            accountNumber = String.format("%010d", (int) (Math.random() * 10000000000L)); // Generates a 10-digit random number
        } while (userRepository.findByAccountNumber(accountNumber).isPresent()); // Ensure it's unique
        return accountNumber;
    }
}
*/

