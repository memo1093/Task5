package Abstract;



import Entities.Game;

public interface GameService {
	public void setPrice(Game game,double price);
	public void getPrice(Game game);
	public void getPriceDiscountFree(Game game);
	public void Rename(Game game,String name);
	/**@param Game
	 * @param discount=this value must be between in 0.00-1.00.
	 * Changes Discount*/
	public void changeDiscount(Game game,double discount);
	
}
