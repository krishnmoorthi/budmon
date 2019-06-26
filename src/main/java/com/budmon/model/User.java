/**
 * 
 */
package com.budmon.model;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author kthangav
 *
 */
@Configuration
public class User extends org.springframework.security.core.userdetails.User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Ledger> ledgers;

	/**
	 * @param username
	 * @param password
	 * @param authorities
	 */
	public User(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	/**
	 * @param username
	 * @param password
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param authorities
	 */
	public User(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the ledgers
	 */
	public List<Ledger> getLedgers() {
		return ledgers;
	}

	/**
	 * @param ledgers the ledgers to set
	 */
	public void setLedgers(List<Ledger> ledgers) {
		this.ledgers = ledgers;
	}

}
