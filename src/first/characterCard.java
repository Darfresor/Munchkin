package first;

public class characterCard {
	String GeneralCardType; // ����� ��� ����� - ���������/�����/�����
	String NickName; // ��������� ������
	String gender; // ���. 0 - ��� ����, 1 - �������, 2 - �������;
	Integer level; // �������. ����� ��������� �������� �� 1 - �� 10. �� ��������� � ���� 1  �������.
	Integer  fightingPower; //������ ����
	String race;  // ����. 0 - �������, 1 - ����, 2 - ����, 3 - ��������
	String profession; // ���������. 0 - ��� ��������; 1- ���, 2 - ����, 3 - ������, 4 - ���.
	String head; //������
	String body; //����
	String leftHand; // ����� ����
	String rightHand; // ������ ����
	String Legs; // �����   �  ������ ����
	String TheBlessing; //��������������
	String Curses; //���������
	String inventory; //���������
	String  hiddenCArd; // ������ ����� �� �����
	
	
	
	public characterCard(String NickName, String gender, Integer level, String race) {
		this.GeneralCardType="�����";
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
		GeneralCardType="�����";
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
