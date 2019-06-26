/**
 * 
 */
package com.budmon.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.budmon.model.Income;
import com.budmon.search.IncomeSearchFilterImpl;
import com.budmon.search.SearchFilters;
import com.budmon.service.ExpenseIncomeService;

/**
 * @author kthangav
 *
 */
public class IncomeLedgerServiceImpl implements ExpenseIncomeService<Income> {

	List<Income> incomes;
	SearchFilters<Income> incomesSearchFilters;

	public IncomeLedgerServiceImpl(List<Income> incomes) {
		this.incomes = incomes;
		this.incomesSearchFilters = new IncomeSearchFilterImpl();
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see practice.Ledger#add(java.lang.Object)
	 */
	@Override
	public void add(Income t) {
		incomes.add(t);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see practice.Ledger#edit(java.lang.Object)
	 */
	@Override
	public void edit(Income t) {
		// TODO Auto-generated method stub

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see practice.Ledger#delete(java.lang.Object)
	 */
	@Override
	public void delete(Income t) {
		incomes.remove(t);
	}

	@Override
	public List<Income> searchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Income> searchByDateAndCategories(String date, List<String> categories) {
		return incomes.parallelStream().filter(incomesSearchFilters.filterLedgerByDateAndCategories(date, categories))
				.collect(Collectors.toList());
	}

	@Override
	public List<Income> searchBetweenDatesAndCategories(List<String> categories, String startDate, String endDate) {
		return incomes.parallelStream()
				.filter(incomesSearchFilters.filterLedgerBetweenDatesAndCategories(categories, startDate, endDate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Income> searchByDateAndCategory(String date, String category) {
		return incomes.parallelStream().filter(incomesSearchFilters.filterLedgerByDateAndCategory(date, category))
				.collect(Collectors.toList());
	}

	@Override
	public List<Income> searchBetweenDatesForCategory(String category, String startDate, String endDate) {
		return incomes.parallelStream()
				.filter(incomesSearchFilters.filterLedgerBetweenDatesForCategory(category, startDate, endDate))
				.collect(Collectors.toList());
	}

	@Override
	public List<Income> searchAllByDate(String date) {
		return incomes.parallelStream().filter(incomesSearchFilters.filterLedgerAllByDate(date))
				.collect(Collectors.toList());
	}

	@Override
	public List<Income> searchAllBetweenDates(String startDate, String endDate) {
		return incomes.parallelStream().filter(incomesSearchFilters.filterLedgerAllBetweenDates(startDate, endDate))
				.collect(Collectors.toList());
	}

}
