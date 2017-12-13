package first;

public class DoorCard {
	String GeneralCardType; // Общий тип карты - сокровище/дверь/игрок
		String typeCard; //проклятие, усиление монстра, ослабление монстра, монстр, класс, расса
		Boolean isUndead; // является ли монстр нежитью
		String NameCard;
		Integer LevelOfMonster;
		Integer  fightingPower; //боевая сила монстра. На нее влияют его особенности  +  усилители от игроков
		String impact; //  воздействие карты. Проклятия если оно есть, или непотребства если это монстр
		String description; // описание карты
		Integer CountOftreasure; //  количество сокровищ
		Integer BonusLevel; // количество  уровней за победу
	
	
		public DoorCard(String typeCard, Boolean isUndead, String NameCard, Integer LevelOfMonster, String impact, String description, Integer CountOftreasure,Integer BonusLevel) {
			this.GeneralCardType="Дверь";
			this.isUndead= isUndead;
			this.typeCard=typeCard;
			this.NameCard=NameCard;
			this.LevelOfMonster=LevelOfMonster;
			this.fightingPower=LevelOfMonster;
			this.impact=impact;
			this.description=description;
			this.CountOftreasure=CountOftreasure;
			this.BonusLevel=BonusLevel;
			
		}
		
		
		
/**
	void setParam(String typeCardx, String NameCardx, Integer LevelOfMonsterx, String impactx, String descriptionx, Integer CountOftreasurex) {
		GeneralCardType="Дверь";
		typeCard=typeCardx;
		NameCard=NameCardx;
		LevelOfMonster=LevelOfMonsterx;
		fightingPower=LevelOfMonsterx;
		impact=impactx;
		description=descriptionx;
		CountOftreasure=CountOftreasurex;
	}
	
**/
	
	void getInfo() {
		System.out.println("");
		System.out.println("GeneralCardType: "+ GeneralCardType);
		System.out.println("isUndead: "+ isUndead);
		System.out.println("typeCard: "+ typeCard);
		System.out.println("NameCard: "+ NameCard);
		System.out.println("LevelOfMonster: "+ LevelOfMonster);
		System.out.println("fightingPower: "+ fightingPower);
		System.out.println("description: "+ description);
		System.out.println("impact: "+ impact);
		System.out.println("BonusLevel: "+ BonusLevel);
		
	
		
}
}
