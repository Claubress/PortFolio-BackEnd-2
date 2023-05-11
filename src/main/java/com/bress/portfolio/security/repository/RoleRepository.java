package com.bress.portfolio.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bress.portfolio.security.entity.Role;
import com.bress.portfolio.security.enums.RoleName;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByRoleName(RoleName roleName);
}
