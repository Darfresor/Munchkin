package first;

public class DoorCard {
	String GeneralCardType; // ����� ��� ����� - ���������/�����/�����
		String typeCard; //���������, �������� �������, ���������� �������, ������, �����, �����
		String NameCard;
		Integer LevelOfMonster;
		Integer  fightingPower; //������ ���� �������. �� ��� ������ ��� �����������  +  ��������� �� �������
		String impact; //  ����������� �����. ��������� ���� ��� ����, ��� ������������ ���� ��� ������
		String description; // �������� �����
		Integer CountOftreasure; //  ���������� ��������
	
	
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
	
	
	
	void getInfo() {
		System.out.println("");
		System.out.println("GeneralCardType: "+ GeneralCardType);
		System.out.println("typeCard: "+ typeCard);
		System.out.println("NameCard: "+ NameCard);
		System.out.println("LevelOfMonster: "+ LevelOfMonster);
		System.out.println("fightingPower: "+ fightingPower);
		System.out.println("description: "+ description);
		System.out.println("impact: "+ impact);
	
		
}
}
