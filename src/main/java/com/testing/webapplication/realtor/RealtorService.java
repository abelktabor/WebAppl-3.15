package com.testing.webapplication.realtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
 class RealtorService implements UserDetailsService {
	//fields
	private final RealtorRepository realRepo;
	private final static String USER_NOT_FOUND = "user with email %s not found";
	
	//cons
	@Autowired
	public RealtorService(RealtorRepository realRepo) {
		this.realRepo = realRepo;
	}

	//methods
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return realRepo.findByEmail(username).orElseThrow(() ->  new UsernameNotFoundException(String.format(USER_NOT_FOUND, username)) );
	}

}
