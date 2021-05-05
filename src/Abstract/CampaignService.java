package Abstract;

import java.util.ArrayList;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	public void addCampaign(Campaign campaign);
	public void deleteCampaign(Campaign campaign);
	public void applyCampaignToAllGames(Campaign campaign,ArrayList<Game> games);
	
}
