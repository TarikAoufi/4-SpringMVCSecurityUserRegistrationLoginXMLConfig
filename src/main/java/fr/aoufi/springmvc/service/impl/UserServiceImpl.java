package fr.aoufi.springmvc.service.impl;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.aoufi.springmvc.dao.RoleDao;
import fr.aoufi.springmvc.dao.UserDao;
import fr.aoufi.springmvc.model.User;
import fr.aoufi.springmvc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserDao userDao;
	
	@Autowired
    private RoleDao roleDao;
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleDao.findAll()));
        userDao.save(user);		
	}

	@Override
	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}	
	
	
}
