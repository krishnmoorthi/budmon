/**
 * 
 */
package com.budmon.service;

import java.util.List;

/**
 * @author kthangav
 *
 */
public interface ExpenseIncomeService<T> {

	public void add(T t);

	public void edit(T t);

	public void delete(T t);

	public List<T> searchAll();

	public List<T> searchByDateAndCategories(String date, List<String> categories);

	public List<T> searchBetweenDatesAndCategories(List<String> categories, String startDate, String endDate);

	public List<T> searchByDateAndCategory(String date, String category);

	public List<T> searchBetweenDatesForCategory(String category, String startDate, String endDate);

	public List<T> searchAllByDate(String date);

	public List<T> searchAllBetweenDates(String startDate, String endDate);
}
