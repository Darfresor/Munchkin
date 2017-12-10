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
        
        
        // Создаем карту вашего персонажа
        
        System.out.println("");
        System.out.println("character initialization ...");
        
        characterCard p1 = new characterCard();
        
        p1.setParam("Sking91","Мужской",1,"человек");
        
        //empty
        
        p1.getInfo();
        
        // раздача карт сокровищ
     
        System.out.println("");
        System.out.println("distribution of treasure cards ...");
        
        treasureCard t1 = new treasureCard();
        
        t1.setParam("Пламенные латы",2, 500, "Броня", 0,false,"нет");;
        
        t1.getInfo();
        
     // раздача карт дверей
        
        
        System.out.println("");
        System.out.println("distribution of doors cards ...");
        
        DoorCard d1 = new DoorCard();
        
        d1.setParam("Монстр","Царь Тут",16,"Сбрось все свои шмотки и всю свою руку","Не преследует Манчкинов 3-го уровня и ниже. Более развитые герои, если не смогли победить  теряют два уровня",4);
        
        d1.getInfo();
        
     
        
        
    }
}
