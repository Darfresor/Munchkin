package first;

public class treasureCard {
		String GeneralCardType; // ����� ��� ����� - ���������/�����/�����
	    String   NameCard;
	    Integer Bonus;
		Integer Cost;
		String TypeOfTreasure; //  ������,  �����, �����
		Integer CountOfHand; //���������� ����������� ���
		Boolean IsBigSize; //������� �� ������
		String constraints;  // ����������� ��  ������/�����/��������/����
	
	void setParam(String NameCardx,Integer Bonusx, Integer Costx, String TypeOfTreasurex, Integer CountOfHandx, Boolean IsBigSizex, String constraintsx) {
		GeneralCardType="���������";
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
