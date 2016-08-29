package fr.aoufi.springmvc.service;

public interface AuthenticationService {
	
	String findLoggedInUsername();

    void autologin(String username, String password);

}
