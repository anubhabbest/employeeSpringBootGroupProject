package com.gl.service;

import org.springframework.stereotype.Service;

import com.gl.entity.Role;
import com.gl.repository.RoleRepository;

@Service
public class RoleService {

	private RoleRepository roleRepository;
	
	public Role addRole(Role role)
	{
		return roleRepository.saveAndFlush(role);
	}
	
}
