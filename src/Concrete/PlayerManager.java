package Concrete;

import java.util.ArrayList;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Game;
import Entities.Player;

public class PlayerManager implements PlayerService{
	private PlayerCheckService playerCheckService;

	/**
	 * @param customerCheckService
	 */
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}

	@Override
	public boolean signIn(Player player) {
		if (playerCheckService.CheckPlayer(player)) {
			System.out.println("Kayýt baþarýlý ! Hoþgeldiniz : " + player.getUserName());
			return true;
		}
		System.out.println("Doðrulama saðlanamadý! Lütfen bilgilerinizi yeniden kontrol ediniz...");
		return false;
	}

	@Override
	public boolean buyGame(Player player, Game game) {
		if (game.getPrice()<=player.getWallet().getBalance()) {
			
			System.out.println("Satýn alma iþlemi baþarýlý!");
			return true;
		}
		System.out.println("Satýn alma iþlemi baþarýsýz! Lütfen mevcut bakiyenizi kontrol ediniz.");
		return false;
	}

	@Override
	public boolean buyGames(Player player, ArrayList<Game> game) {
		double totalPrice=0;
		for (Game gamesToBuy : game) {
			totalPrice += gamesToBuy.getPrice();
		}
		if (totalPrice<=player.getWallet().getBalance()) {
			System.out.println("Satýn alma iþlemi baþarýlý!");
			return true;
		}
		System.out.println("Satýn alma iþlemi baþarýsýz! Lütfen mevcut bakiyenizi kontrol ediniz.");
		return false;
	}

	@Override
	public void avalibleGames(Player player) {
		System.out.println("---Mevcut Oyunlar---");
		for (Game avalibleGames : player.getGames()) {
			System.out.println(avalibleGames.getName() + "|" + avalibleGames.getPrice());
		}
		
	}

	
	@Override
	public void depositMoney(Player player, double depositingMoney) {
		balance(player);
		double totalBalance = player.getWallet().getBalance();
		player.getWallet().setBalance(depositingMoney+totalBalance);
		System.out.println("Yeni Bakiyeniz : " +player.getWallet().getBalance());
	}

	@Override
	public void balance(Player player) {
		System.out.println("Mevcut Bakiyeniz : " + player.getWallet().getBalance());
		
	}

	

}
