package ro.ase.cts.hw1.account;

import java.util.ArrayList;

import ro.ase.cts.hw1.refactor.phase1.AccountType;

public class TestInitialThing {

	public static void main(String[] args) throws Exception {
		
							//value, rate
		Account ac1 = new Account(5, 10, Account.BUDGET);
		Account ac2 = new Account(5, 10, Account.PREMIUM);
		Account ac3 = new Account(5, 10, Account.PREMIUM);
		Account ac4 = new Account(5, 10, Account.SUPER_PREMIUM);
		
		Account[] allAcc = new Account[4] ;
		allAcc[0]=ac1;
		allAcc[1]=ac2;
		allAcc[2]=ac3;
		allAcc[3]=ac4;
		
		ac1.daysActive = 10;
		ac2.daysActive = 100;
		ac3.daysActive = 10;
		ac4.daysActive = 40;
		
		ac1.print();
		
		double rez = Account.calculate(allAcc);
		
		System.out.println(rez);
		
	}

}
