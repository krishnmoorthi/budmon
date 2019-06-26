/**
 * 
 */
package com.budmon.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.budmon.model.Expense;
import com.budmon.search.ExpenseSearchFilterImpl;
import com.budmon.search.SearchFilters;
import com.budmon.service.ExpenseIncomeService;

/**
 * @author kthangav
 *
 */
public class ExpenseLedgerServiceImpl implements ExpenseIncomeService<Expense> {

	List<Expense> expenses;
	SearchFilters<Expense> expenseSearchFilters;

	public ExpenseLedgerServiceImpl(List<Expense> expenses) {
		this.expenses = expenses;
		this.expenseSearchFilters = new ExpenseSearchFilterImpl();
	}

	@Override
	public void add(Expense expense) {
		expenses.add(expense);
	}

	@Override
	public void edit(Expense expense) {
		//TODO edit expense
	}

	@Override
	public void delete(Expense expense) {
		expenses.remove(expense);
	}

	@Override
	public List<Expense> searchAll() {
		return expenses;
	}

	@Override
	public List<Expense> searchByDateAndCategories(String date, List<String> categories) {
		return expenses.parallelStream().filter(expenseSearchFilters.filterLedgerByDateAndCategories(date, categories))
				.collect(Collectors.toList());
	}

	@Override
	public List<Expense> searchBetweenDatesAndCategories(List<String> categories, String startDate, String endDate) {
		return expenses.parallelStream()
				.filter(expenseSearchFilters.filterLedgerBetweenDatesAndCategories(categories, startDate, endDate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Expense> searchByDateAndCategory(String date, String category) {
		return expenses.parallelStream().filter(expenseSearchFilters.filterLedgerByDateAndCategory(date, category))
				.collect(Collectors.toList());
	}

	@Override
	public List<Expense> searchBetweenDatesForCategory(String category, String startDate, String endDate) {
		return expenses.parallelStream()
				.filter(expenseSearchFilters.filterLedgerBetweenDatesForCategory(category, startDate, endDate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Expense> searchAllByDate(String date) {
		return expenses.parallelStream().filter(expenseSearchFilters.filterLedgerAllByDate(date))
				.collect(Collectors.toList());
	}

	@Override
	public List<Expense> searchAllBetweenDates(String startDate, String endDate) {
		return expenses.parallelStream().filter(expenseSearchFilters.filterLedgerAllBetweenDates(startDate, endDate))
				.collect(Collectors.toList());
	}

}
