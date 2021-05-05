package Main;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter() );
		GameManager gameManager = new GameManager();
		CampaignManager campaignManager = new CampaignManager(gameManager);
		
		Player player = new Player(1,"Mehmet","Akyer","memo","10093302738",LocalDate.of(1994, 9, 26));
		Game game = new Game(1,"Call of duty",200,0.2);
		playerManager.signIn(player);
		playerManager.depositMoney(player, 5000);
		playerManager.buyGame(player, game);
		
		
	}

}
