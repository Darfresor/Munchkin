package first;

public class characterCard {
	String GeneralCardType; // Общий тип карты - сокровище/дверь/игрок
	String NickName; // псевдоним игрока
	String gender; // Пол. 0 - нет пола, 1 - мужчина, 2 - женщина;
	Integer level; // уровень. Может принимать значение от 1 - до 10. По умолчанию у всех 1  уровень.
	Integer  fightingPower; //боевая сила
	String race;  // раса. 0 - человек, 1 - гном, 2 - эльф, 3 - хафлиинг
	String profession; // Профессия. 0 - нет професии; 1- Маг, 2 - Воин, 3 - Клирик, 4 - Вор.
	String head; //голова
	String body; //тело
	String leftHand; // левая рука
	String rightHand; // правая рука
	String Legs; // левая   и  правая нога
	String TheBlessing; //благословления
	String Curses; //проклятия
	String inventory; //инвентарь
	String  hiddenCArd; // скрыте карты на руках
	
	
	
	public characterCard(String NickName, String gender, Integer level, String race) {
		this.GeneralCardType="Игрок";
		this.NickName=NickName;
		this.gender=gender; 
		this.level= level; 
		this.fightingPower=level;
		this.race=race; 
		this.profession = null; 
		this.head = null; 
		this.body = null; 
		this.leftHand = null;
		this.rightHand = null; 
		this.Legs = null; 
		this.TheBlessing = null; 
		this.Curses = null; 
		this.inventory = null; 
		this.hiddenCArd = null;	
		
	}
	
	
	
	/**
	
	void setParam(String NickNamex, String genderx, Integer levelx, String racex) {
		GeneralCardType="Игрок";
		NickName=NickNamex;
		gender=genderx; 
		level= levelx; 
		fightingPower=level;
		race=racex; 
		//String profession; 
		//String head; 
		//String body; 
		//String leftHand;
		//String rightHand; 
		//String leftLeg; 
		//String rightLeg; 
		//String TheBlessing; 
		//String Curses; 
		//String inventory; 
		//String  hiddenCArd; 
	}
	
	**/
	
	void getInfo() {
		System.out.println("");
		System.out.println("GeneralCardType: "+GeneralCardType);
		System.out.println("NickName: "+NickName);
		System.out.println("gender: "+gender);
		System.out.println("level: "+level);
		System.out.println("fightingPower: "+fightingPower);
		System.out.println("race: "+race);
		
		System.out.println("profession: "+profession);
		System.out.println("head: "+head);
		System.out.println("body: "+body);
		System.out.println("leftHand: "+leftHand);
		System.out.println("rightHand: "+rightHand);
		System.out.println("Legs: "+Legs);
		System.out.println("TheBlessing: "+TheBlessing);
		System.out.println("Curses: "+Curses);
		System.out.println("inventory: "+inventory);
		System.out.println("hiddenCArd: "+hiddenCArd);
		
	}
	
}
