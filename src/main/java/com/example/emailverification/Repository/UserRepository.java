package com.example.emailverification.Repository;

import com.example.emailverification.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserEmailIgnoreCase(String emailId);

    Boolean existsByUserEmail(String email);
}
