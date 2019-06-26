/**
 * 
 */
package com.budmon.search;

import java.util.List;
import java.util.function.Predicate;

import com.budmon.model.Income;
import com.budmon.utilities.CommonUtils;

/**
 * @author kthangav
 *
 */
public class IncomeSearchFilterImpl implements SearchFilters<Income> {

	@Override
	public Predicate<Income> filterLedgerByDateAndCategories(String date, List<String> categories) {
		Predicate<Income> predicate = (Income income) -> income.getDate() == (CommonUtils.convertDateToLong(date));
		addPredicatesForCategories(predicate, categories);
		return predicate;
	}

	@Override
	public Predicate<Income> filterLedgerBetweenDatesAndCategories(List<String> categories, String startDate,
			String endDate) {
		Predicate<Income> predicate = (
				Income income) -> (income.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& income.getDate() <= CommonUtils.convertDateToLong(endDate));
		addPredicatesForCategories(predicate, categories);
		return predicate;
	}

	@Override
	public Predicate<Income> filterLedgerByDateAndCategory(String date, String category) {
		Predicate<Income> predicate = (Income income) -> income.getDate() == (CommonUtils.convertDateToLong(date));
		predicate.and((Income income) -> income.getCategory().equalsIgnoreCase(category));
		return predicate;
	}

	@Override
	public Predicate<Income> filterLedgerBetweenDatesForCategory(String category, String startDate, String endDate) {
		Predicate<Income> predicate = (
				Income income) -> (income.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& income.getDate() <= CommonUtils.convertDateToLong(endDate));
		predicate.and((Income income) -> income.getCategory().equalsIgnoreCase(category));
		return predicate;
	}

	@Override
	public Predicate<Income> filterLedgerAllByDate(String date) {
		Predicate<Income> predicate = (Income income) -> income.getDate() == (CommonUtils.convertDateToLong(date));
		return predicate;
	}

	@Override
	public Predicate<Income> filterLedgerAllBetweenDates(String startDate, String endDate) {
		Predicate<Income> predicate = (
				Income income) -> (income.getDate() >= CommonUtils.convertDateToLong(startDate)
						&& income.getDate() <= CommonUtils.convertDateToLong(endDate));
		return predicate;
	}

	private void addPredicatesForCategories(Predicate<Income> predicate, List<String> categories) {
		for (String category : categories) {
			predicate.and((Income income) -> income.getCategory().equalsIgnoreCase(category));
		}
	}
}
