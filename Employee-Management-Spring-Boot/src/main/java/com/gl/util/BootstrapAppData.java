package com.gl.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.gl.entity.Role;
import com.gl.entity.User;
import com.gl.repository.EmployeeRepository;
import com.gl.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class BootstrapAppData {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	@EventListener(ApplicationReadyEvent.class)
	public void insertEmployees(ApplicationReadyEvent event)
	{
		User admin=new User();
		admin.setUsername("admin");
		admin.setPassword(passwordEncoder.encode("admin"));
		Role adminRole=new Role();
		adminRole.setName("ADMIN");
		List list=new ArrayList<>();
		list.add(adminRole);
		admin.setRoles(list);
		userRepository.saveAndFlush(admin);
	}
	
}
