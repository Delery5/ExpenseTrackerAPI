package com.delery.expensetrackerapi.service;

import java.util.List;

import com.delery.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	
	List<Expense> getAllExpenses();
	
	Expense getExpensesById(Long id);
	
	void deletedExpenseById(Long id);
	
	Expense saveExpenseDetails(Expense expense);
	
	Expense updateExpense(Long id, Expense expense);
	
	
}
