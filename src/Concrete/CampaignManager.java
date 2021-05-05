package Concrete;

import java.util.ArrayList;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService{
	
	private ArrayList<Campaign> allCampaigns;
	private GameManager gameManager;

	public CampaignManager(GameManager gameManager) {
		super();
		this.gameManager = gameManager;
	}

	@Override
	public void addCampaign(Campaign campaign) {
		allCampaigns.add(campaign);
		System.out.println("Kampanya Eklendi!");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		allCampaigns.remove(campaign);
		System.out.println("Kampanya Kaldýrýldý!");
	}

	@Override
	public void applyCampaignToAllGames(Campaign campaign, ArrayList<Game> games) {
		for (Game game : games) {
			gameManager.changeDiscount(game, campaign.getDiscount());
		}
		
	}


}
