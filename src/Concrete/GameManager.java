package Concrete;



import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void setPrice(Game game,double price) {
		
		game.setPriceDiscountFree(price);
		System.out.println("Fiyat deðiþtirildi! - "+ game.getPrice());
		
	}

	@Override
	public void getPrice(Game game) {
		System.out.println(game.getPrice());
		
	}

	@Override
	public void Rename(Game game,String name) {
		game.setName(name);
		System.out.println("Oyunun þimdiki adý : "+ game.getName());
	}

	@Override
	public void changeDiscount(Game game, double discount) {
		game.setDiscount(discount);
		System.out.println("Ýndirim miktarý deðiþtirildi");
		
	}

	
	@Override
	public void getPriceDiscountFree(Game game) {
		System.out.println(game.getPriceDiscountFree());
		
	}
	
}
