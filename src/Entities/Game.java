package Entities;

import Abstract.Entity;

public class Game implements Entity{
	//Fields
	private int Id;
	private String Name;
	private double Price;
	private double Discount;
	private double PriceDiscountFree;
	
	//Constructors
	public Game() {
		
	}
	/**
	 * @param id
	 * @param name
	 * @param priceDiscountFree
	 * @param discount
	 */
	public Game(int id, String name, double priceDiscountFree, double discount) {
		super();
		Id = id;
		Name = name;
		PriceDiscountFree = priceDiscountFree;
		Discount = discount;
		Price = this.setPrice(priceDiscountFree);
	}
	//Getter-Setter
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPriceDiscountFree() {
		return PriceDiscountFree;
	}
	public void setPriceDiscountFree(double priceDiscountFree) {
		PriceDiscountFree = priceDiscountFree;
	}
	public double getPrice() {
		return Price;
	}
	public double setPrice(double price) {
		Price = Discount!=0.00?price:price*Discount;
		return Price;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
}
