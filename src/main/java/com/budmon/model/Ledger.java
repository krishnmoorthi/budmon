/**
 * 
 */
package com.budmon.model;

import java.util.List;

/**
 * @author kthangav
 *
 */
public class Ledger {
	
	private long id;
	private String name;
	private long userId;
	private List<Expense> expenses;
	private List<Income> incomes;
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * @return the expenses
	 */
	public List<Expense> getExpenses() {
		return expenses;
	}
	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}
	/**
	 * @return the incomes
	 */
	public List<Income> getIncomes() {
		return incomes;
	}
	/**
	 * @param incomes the incomes to set
	 */
	public void setIncomes(List<Income> incomes) {
		this.incomes = incomes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((expenses == null) ? 0 : expenses.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((incomes == null) ? 0 : incomes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Ledger)) {
			return false;
		}
		Ledger other = (Ledger) obj;
		if (expenses == null) {
			if (other.expenses != null) {
				return false;
			}
		} else if (!expenses.equals(other.expenses)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (incomes == null) {
			if (other.incomes != null) {
				return false;
			}
		} else if (!incomes.equals(other.incomes)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (userId != other.userId) {
			return false;
		}
		return true;
	}
	


}
