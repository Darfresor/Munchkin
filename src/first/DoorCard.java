package first;

public class DoorCard {
	String GeneralCardType; // ����� ��� ����� - ���������/�����/�����
		String typeCard; //���������, �������� �������, ���������� �������, ������, �����, �����
		Boolean isUndead; // �������� �� ������ �������
		String NameCard;
		Integer LevelOfMonster;
		Integer  fightingPower; //������ ���� �������. �� ��� ������ ��� �����������  +  ��������� �� �������
		String impact; //  ����������� �����. ��������� ���� ��� ����, ��� ������������ ���� ��� ������
		String description; // �������� �����
		Integer CountOftreasure; //  ���������� ��������
		Integer BonusLevel; // ����������  ������� �� ������
	
	
		public DoorCard(String typeCard, Boolean isUndead, String NameCard, Integer LevelOfMonster, String impact, String description, Integer CountOftreasure,Integer BonusLevel) {
			this.GeneralCardType="�����";
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
		GeneralCardType="�����";
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
