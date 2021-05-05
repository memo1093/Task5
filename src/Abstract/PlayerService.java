package Abstract;

import java.util.ArrayList;

import Entities.Game;
import Entities.Player;

public interface PlayerService {
	public boolean signIn(Player player);
	public boolean buyGame(Player player,Game game);
	public boolean buyGames(Player player,ArrayList<Game> game);
	public void avalibleGames(Player player);
	public void depositMoney(Player player,double depositingMoney);
	public void balance(Player player);
	
	
}
