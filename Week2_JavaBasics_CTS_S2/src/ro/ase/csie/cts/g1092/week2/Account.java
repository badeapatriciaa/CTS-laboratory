package ro.ase.csie.cts.g1092.week2;

import ro.ase.csie.cts.g1092.week2.exceptions.IllegalTransferException;
import ro.ase.csie.cts.g1092.week2.exceptions.InsufficientFundsException;

public abstract class Account {

	public abstract double getBalance();
	public abstract void deposit(double amount);//daca voiam sa pun orice acolo, foloseam Object in loc de double
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException;
	public abstract void withdraw(double amount) throws InsufficientFundsException;
	
	}

