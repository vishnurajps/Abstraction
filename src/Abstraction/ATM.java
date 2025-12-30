package Abstraction;

abstract class ATM {
	abstract void balance();
	abstract void withdraw();
}
class MyATM extends ATM
{
	int balance = 200000;
	
	void withdraw() {
		int amount = 2000;
		balance = balance - amount;
		System.out.println("Withdraw Amount " + amount);
	}
	void balance() {
		System.out.println("balance " + balance);
	}
}

