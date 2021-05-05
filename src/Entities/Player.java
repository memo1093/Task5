package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

import Abstract.Entity;

public class Player implements Entity {
	private int Id;
	private String FirstName;
	private String LastName;
	private String UserName;
	private String NationalityId;
	private LocalDate BirthDate;
	private ArrayList<Game> Games;
	private Wallet Wallet;
	
	

	//Constructors
	/***/
	public Player() {
		
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @param nationalityId
	 * @param birthDate
	 */
	public Player(int id, String firstName, String lastName,String userName, String nationalityId, LocalDate birthDate) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		UserName = userName;
		NationalityId = nationalityId;
		BirthDate = birthDate;
		Wallet = new Wallet(String.valueOf(Math.floor(Math.random()*10000)) ,0);
	}

	
	//Getter-Setter
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the nationalityId
	 */
	public String getNationalityId() {
		return NationalityId;
	}

	/**
	 * @param nationalityId the nationalityId to set
	 */
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return BirthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}

	/**
	 * @return the games
	 */
	public ArrayList<Game> getGames() {
		return Games;
	}

	/**
	 * @param games the games to set
	 */
	public void setGames(ArrayList<Game> games) {
		Games = games;
	}
	/**
	 * @return the wallet
	 */
	public Wallet getWallet() {
		return Wallet;
	}
}
