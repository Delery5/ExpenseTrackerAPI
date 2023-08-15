package com.delery.expensetrackerapi.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delery.expensetrackerapi.entity.Expense;
import com.delery.expensetrackerapi.service.ExpenseService;

@RestController
public class ExpenseController {

	final Logger log =LoggerFactory.getLogger(ExpenseController.class);

	@Autowired
	private ExpenseService expenseService;
	
	@RequestMapping(value = "/expenses/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Expense> updateExpense(@RequestBody Expense expense, @PathVariable Long id) throws IOException{
		log.info("#### Invoked ExpenseController.java (getAllExpenses) method");
		log.info("#### Exited ExpenseController.java (getAllExpenses) method");
				return new ResponseEntity<>(expenseService.updateExpense(id, expense), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/expenses", method = RequestMethod.GET)
	public ResponseEntity<List<Expense>> getAllExpenses() throws IOException{
		log.info("#### Invoked ExpenseController.java (getAllExpenses) method");
		log.info("#### Exited ExpenseController.java (getAllExpenses) method");
				return new ResponseEntity<List<Expense>>(expenseService.getAllExpenses(), HttpStatus.OK);
	}

	@RequestMapping(value = "/expenses/{id}", method = RequestMethod.GET)
	public ResponseEntity<Expense> getExpensesById(@PathVariable(name = "id") Long id) throws IOException{
		
		return ResponseEntity.ok(expenseService.getExpensesById(id));
	}
	
	
	@RequestMapping(value = "/expenses", method = RequestMethod.POST)
	public ResponseEntity<Expense> saveExpenseDetails(@RequestBody Expense expense) throws IOException{
		
			return new ResponseEntity<>(expenseService.saveExpenseDetails(expense),HttpStatus.OK);
}
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/expenses", method = RequestMethod.DELETE)
	public void deletedExpenseById(@RequestParam("id") Long id){ 
		 expenseService.deletedExpenseById(id);
	}
}
