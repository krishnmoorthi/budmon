/**
 * 
 */
package com.budmon.search;

import java.util.List;
import java.util.function.Predicate;

import com.budmon.model.Expense;
import com.budmon.utilities.CommonUtils;

/**
 * @author kthangav
 *
 */
public class ExpenseSearchFilterImpl implements SearchFilters<Expense> {

	@Override
	public Predicate<Expense> filterLedgerByDateAndCategories(String date, List<String> categories) {
		Predicate<Expense> predicate = (Expense expense) -> expense.getDate() == (CommonUtils.convertDateToLong(date));
		addPredicatesForCategories(predicate, categories);
		return predicate;
	}

	@Override
	public Predicate<Expense> filterLedgerBetweenDatesAndCategories(List<String> categories, String startDate,
			String endDate) {
		Predicate<Expense> predicate = (
				Expense expense) -> (expense.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& expense.getDate() <= CommonUtils.convertDateToLong(endDate));
		addPredicatesForCategories(predicate, categories);
		return predicate;
	}

	@Override
	public Predicate<Expense> filterLedgerByDateAndCategory(String date, String category) {
		Predicate<Expense> predicate = (Expense expense) -> expense.getDate() == (CommonUtils.convertDateToLong(date));
		predicate.and((Expense expense) -> expense.getCategory().equalsIgnoreCase(category));
		return predicate;
	}

	@Override
	public Predicate<Expense> filterLedgerBetweenDatesForCategory(String category, String startDate, String endDate) {
		Predicate<Expense> predicate = (
				Expense expense) -> (expense.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& expense.getDate() <= CommonUtils.convertDateToLong(endDate));
		predicate.and((Expense expense) -> expense.getCategory().equalsIgnoreCase(category));
		return predicate;
	}

	@Override
	public Predicate<Expense> filterLedgerAllByDate(String date) {
		Predicate<Expense> predicate = (Expense expense) -> expense.getDate() == (CommonUtils.convertDateToLong(date));
		return predicate;
	}

	@Override
	public Predicate<Expense> filterLedgerAllBetweenDates(String startDate, String endDate) {
		Predicate<Expense> predicate = (
				Expense expense) -> (expense.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& expense.getDate() <= CommonUtils.convertDateToLong(endDate));
		return predicate;
	}

	private void addPredicatesForCategories(Predicate<Expense> predicate, List<String> categories) {
		for (String category : categories) {
			predicate.and((Expense expense) -> expense.getCategory().equalsIgnoreCase(category));
		}
	}

}
