/**
 * 
 */
package com.budmon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budmon.model.User;

/**
 * @author krishnamoorthi
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}