package com.bress.portfolio.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bress.portfolio.security.entity.Role;
import com.bress.portfolio.security.enums.RoleName;
import com.bress.portfolio.security.repository.RoleRepository;

@Service
@Transactional
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
	
	public Optional<Role> getByRoleName(RoleName roleName) {
		return roleRepository.findByRoleName(roleName);
	}
	
	public void save(Role role){
        roleRepository.save(role);
    }
	
}
