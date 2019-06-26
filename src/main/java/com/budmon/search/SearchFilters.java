/**
 * 
 */
package com.budmon.search;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author kthangav
 *
 */
public interface SearchFilters<T> {
	
	public Predicate<T> filterLedgerByDateAndCategories(String date, List<String> categories);
	public Predicate<T> filterLedgerBetweenDatesAndCategories(List<String> categories,String startDate, String endDate);
	public Predicate<T> filterLedgerByDateAndCategory(String date,String category);
	public Predicate<T> filterLedgerBetweenDatesForCategory(String category,String startDate,String endDate);
	public Predicate<T> filterLedgerAllByDate(String date);
	public Predicate<T> filterLedgerAllBetweenDates(String startDate, String endDate);

}
