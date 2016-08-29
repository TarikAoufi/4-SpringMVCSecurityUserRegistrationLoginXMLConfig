package fr.aoufi.springmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.aoufi.springmvc.model.User;

public interface UserDao extends JpaRepository<User, Long> {
	
    User findByUsername(String username);
}
