package br.com.r4s.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.r4s.hroauth.entities.User;
import br.com.r4s.hroauth.feignclients.UserFeignClient;

@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	public User findByEmail(String email) {
		
		User user = userFeignClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("EMAIL not found: " + email);
			throw new IllegalArgumentException("Email not found");
		}
		
		logger.info("EMAIL found: " + email);
		
		return user;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userFeignClient.findByEmail(username).getBody();
		if(user == null) {
			logger.error("EMAIL not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		
		logger.info("EMAIL found: " + username);
		
		return user;
	}
}
