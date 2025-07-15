package me.dio.domain.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // O Spring implementa automaticamente com as palavras chaves (EXISTS BY ACCOUNT_NUMBER)
    boolean existsByAccountNumber(String number);
}
