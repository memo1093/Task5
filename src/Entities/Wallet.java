package Entities;

import Abstract.Entity;

public class Wallet implements Entity{
	//Fields
	private String Id;
	private double balance;
	/**
	 * @param id
	 * @param balance
	 */
	public Wallet(String id, double balance) {
		super();
		Id = id;
		this.balance = balance;
	}
	//Getter-Setter
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
