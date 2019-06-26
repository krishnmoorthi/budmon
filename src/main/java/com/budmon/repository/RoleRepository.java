package com.budmon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budmon.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>  {

}
