package net.project.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.project.springboot.model.User;
import net.project.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
