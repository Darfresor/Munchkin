package first;

/**
 * @author sking91
 *
 */
public class game {
		
	
			
	public static void main(String[] args) {
		
		SystemMessages sm = new SystemMessages(); // ������� ����� ��� ������ � ����������� ����
		
		sm.getStartMenu();
        
        
        
        // ������� ����� ������ ���������
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("character initialization ...");
        System.out.println("=================================================");
        
        characterCard p1 = new characterCard("Sking91","�������",1,"�������");
      
        
        //empty
        
        p1.getInfo();
        
        
        
        // �������� ������  ���� �������� ������
     
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("distribution of starting treasure cards pack...");
        System.out.println("=================================================");
        
        treasureCard [] t1 = new treasureCard[4];
        
        t1[0] = new treasureCard("��������� ����",2, 500, "�����", 0,false,"���","...");
        
        t1[1] = new treasureCard("���������-����������",0, 700, "������", 0,false,"���","�������� ����  �� ���������, ������� �� ����������� ������� �����. �� ������ �� ��������� ��������� ������� ��������.");
        
        t1[2] = new treasureCard("����� ���� �������",4, 600, "������", 2,true,"���","...");
        
        t1[3] = new treasureCard("����������� �������",0, 600, "�����������", 0,false,"�� ��� ��������","�� ���� �����, ��� ������� ���� ������, �� ����� �������� ���� ������ � ���  � �� ������� �� ��� �������.  �� �� ������ �������� �������� ������� ��  ���, � ������� ���� �������� �������� �������������.");
        

        // ����� ���� ��������� ���� �������������� ������ ��������
        
        System.out.println("");
        
        for(int i = 0; i < t1.length; i++){
        	System.out.println("");
        	System.out.print("Card "+(i+1)+"/" + t1.length);
        	t1[i].getInfo(); 
        }
      
 
        
        
        
        
     // ������� ���� ������ ������
        
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("distribution of starting doors cards pack...");
        System.out.println("=================================================");
        
        DoorCard [] d1 = new DoorCard[4];
        
        d1[0] =new DoorCard("������",true,"���� ���",16,"������ ��� ���� ������ � ��� ���� ����","�� ���������� ��������� 3-�� ������ � ����. ����� �������� �����, ���� �� ������ ��������  ������ ��� ������",4,2);
        
        d1[1] =new DoorCard("������",true,"����-��������",5,"��������� ��������� ������� ������  ���� 2 �������!","���� ������ �� ��������� ������ ������ ����, ����� ����� �  �����, ��� ������ ������� ���������� ������. ������ ������, ���� ������  ����: ��� ��������� ������ ������� � ������� +3",2,1);
        
        d1[2] =new DoorCard("������",false,"�����������",15,"�� ����� ��� ���� ��������/��������� ������ - ������ ��","��������/���������  ������  ���� ������ ���� ��������� ����",4,2);
        
        d1[3] =new DoorCard("������",true,"������ ������",9,"����������� �� ����������. �������3 ������","+5 ������ ���������",3,1);
        
        //d1.setParam("������","���� ���",16,"������ ��� ���� ������ � ��� ���� ����","�� ���������� ��������� 3-�� ������ � ����. ����� �������� �����, ���� �� ������ ��������  ������ ��� ������",4);
        
        //d1.getInfo();
        
     
     
        
         System.out.println("");
        
        for(int i = 0; i < d1.length; i++){
        	System.out.println("");
        	System.out.print("Card "+(i+1)+"/" + d1.length);
        	d1[i].getInfo(); 
        }
        
        
        System.out.println("");
        sm.getWaitMenu();
        
        
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("equip your character...");
        System.out.println("Select Items...");
        System.out.println("=================================================");
        
        
        
        
    }
}
