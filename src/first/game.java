package first;

/**
 * @author sking91
 *
 */
public class game {
		
	
			
	public static void main(String[] args) {
		
		String version ="0.0.2";
		
		
        System.out.println("PC version of the board game Munchkin launched");
        System.out.println("Current version "+version);
        System.out.println("Menu");
        System.out.println("1.Start game");
        System.out.println("2.Exit");
        
        
        // ������� ����� ������ ���������
        
        System.out.println("");
        System.out.println("character initialization ...");
        
        characterCard p1 = new characterCard();
        
        p1.setParam("Sking91","�������",1,"�������");
        
        //empty
        
        p1.getInfo();
        
        // ������� ���� ��������
     
        System.out.println("");
        System.out.println("distribution of treasure cards ...");
        
        treasureCard t1 = new treasureCard();
        
        t1.setParam("��������� ����",2, 500, "�����", 0,false,"���");;
        
        t1.getInfo();
        
     // ������� ���� ������
        
        
        System.out.println("");
        System.out.println("distribution of doors cards ...");
        
        DoorCard d1 = new DoorCard();
        
        d1.setParam("������","���� ���",16,"������ ��� ���� ������ � ��� ���� ����","�� ���������� ��������� 3-�� ������ � ����. ����� �������� �����, ���� �� ������ ��������  ������ ��� ������",4);
        
        d1.getInfo();
        
     
        
        
    }
}
