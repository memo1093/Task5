package Entities;

import java.util.ArrayList;

import Abstract.Entity;

public class Campaign implements Entity{
	//Fields
	private String CampaignName;
	private double Discount;
	private ArrayList<Game> CampaignGames;
	//Constructors
	public Campaign() {
		super();
	}
	public Campaign(String campaingName, double discount) {
		super();
		CampaignName = campaingName;
		Discount = discount;
	}
	public Campaign(String campaingName, double discount, ArrayList<Game> campaignGames) {
		super();
		CampaignName = campaingName;
		Discount = discount;
		CampaignGames = campaignGames;
	}
	//Getter-Setter
	public String getCampaingName() {
		return CampaignName;
	}
	public void setCampaingName(String campaingName) {
		CampaignName = campaingName;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public ArrayList<Game> getCampaignGames() {
		return CampaignGames;
	}
	public void setCampaignGames(ArrayList<Game> campaignGames) {
		CampaignGames = campaignGames;
	}
	
}
