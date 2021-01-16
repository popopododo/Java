package javaprac;

public class CardCompany {
	private static CardCompany instance = new CardCompany();
	public static int CardNumber=10001;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance==null)
			instance = new CardCompany();
		
		return instance;
		
	}

	public Card createCard()
	{
		setCardNumber(getCardNumber() + 1);
		Card card= new Card();
		card.CardNum= CardNumber;
		return card;
	}

	public static int getCardNumber() {
		return CardNumber;
	}

	public static void setCardNumber(int cardNumber) {
		CardNumber = cardNumber;
	}
}
