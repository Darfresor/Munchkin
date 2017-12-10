package first;

public class treasureCard {
		String GeneralCardType; // Общий тип карты - сокровище/дверь/игрок
	    String   NameCard;
	    Integer Bonus;
		Integer Cost;
		String TypeOfTreasure; //  оружие,  броня, зелья
		Integer CountOfHand; //количество необходимых рук
		Boolean IsBigSize; //Большая ли шмотка
		String constraints;  // ограничения по  классу/рассе/професии/полу
	
	void setParam(String NameCardx,Integer Bonusx, Integer Costx, String TypeOfTreasurex, Integer CountOfHandx, Boolean IsBigSizex, String constraintsx) {
		GeneralCardType="Сокровища";
		NameCard=NameCardx;
		Bonus=Bonusx;
		Cost=Costx;
		TypeOfTreasure=TypeOfTreasurex;
		CountOfHand=CountOfHandx;
		IsBigSize=IsBigSizex;
		constraints=constraintsx;
	}
	
	
	
	void getInfo() {
		System.out.println("");
		System.out.println("GeneralCardType: "+ GeneralCardType);
		System.out.println("NameCard: "+ NameCard);
		System.out.println("TypeOfTreasure: "+ TypeOfTreasure);
		System.out.println("Bonus: "+ Bonus);
		System.out.println("Cost: "+ Cost);
		System.out.println("CountOfHand: "+ CountOfHand);
		System.out.println("IsBigSize: "+ IsBigSize);
		System.out.println("constraints: "+ constraints);
}


	
}
