package com.codingdojo.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.models.TempUser;
import com.codingdojo.models.User;
import com.codingdojo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void login(TempUser tempUser) {
		
	}
	
	public User register(User user, BindingResult res) {
		
		
		if(userRepository.findByEmail(user.getEmail())!=null) {
			
			res.rejectValue("email","email_invalid","A user with this email already exists");
			return null;
		}
		if(!user.getPassword().equals(user.getConfirm())) {
			
			res.rejectValue("password", "pass_no_match", "Password and Password Confirmation must match.");
			res.rejectValue("confirm", "pass_no_match", "Password and Password Confirmation must match.");
			return null;
		}
		
		String form_password=user.getPassword();
		String hash=BCrypt.hashpw(form_password,BCrypt.gensalt(8));
		user.setPassword(hash);
		userRepository.save(user);
		return user;
	}
	
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}
}
