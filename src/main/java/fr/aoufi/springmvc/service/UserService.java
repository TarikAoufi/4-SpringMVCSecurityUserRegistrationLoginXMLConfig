package fr.aoufi.springmvc.service;

import fr.aoufi.springmvc.model.User;

public interface UserService {
	
	void save(User user);
    User findByUsername(String username);

}
