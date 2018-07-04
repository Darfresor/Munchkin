import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sking91
 *
 */


public class Main {
    public static void main(String[] args) {

        SystemMessages sm = new SystemMessages(); // создаем класс для работы с сообщениями меню

        sm.getStartMenu();


        // Создаем карту вашего персонажа

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("character initialization ...");
        System.out.println("=================================================");

        characterCard p1 = new characterCard("Sking91", "Мужской", 1, "человек");


        //empty

        p1.getInfo();


        // создание колоды  карт сокровищ игрока

        System.out.println("");
        System.out.println("=================================================");
        System.out.println("distribution of starting treasure cards pack...");
        System.out.println("=================================================");

        treasureCard [] t1 = new treasureCard[4];

        t1[0] = new treasureCard("Пламенные латы",2, 500, "Броня", 0,false,"нет","...");

        t1[1] = new treasureCard("Сандалеты-протекторы",0, 700, "Обувка", 0,false,"нет","Защищают тебя  от проклятий," +
                " которые ты вытягиваешь вышибая двери. " +
                "Не спасут от проклятий сыгранных другими игроками.");

        t1[2] = new treasureCard("Топор Пола Баньяна",4, 600, "Оружие", 2,true,"нет","...");

        t1[3] = new treasureCard("Наколенники развода",0, 600, "Наколенники", 0,false,"не для клириков","Ни один игрок, " +
                "чей уровень выше твоего, не может отказать" +
                " тебе помочь в бою  и не требует за это награды.  Ты не можешь получить победный уровень за  бой, в котором твой помощник разведен наколенниками.");


        // вывод всех доступных карт первоначальной колоды сокровищ

        System.out.println("");

        for(int i = 0; i < t1.length; i++){
            System.out.println("");
            System.out.print("Card "+(i+1)+"/" + t1.length);
            t1[i].getInfo();
        }






        // раздача карт дверей игрока


        System.out.println("");
        System.out.println("=================================================");
        System.out.println("distribution of starting doors cards pack...");
        System.out.println("=================================================");

        DoorCard [] d1 = new DoorCard[4];

        d1[0] =new DoorCard("Монстр",true,"Царь Тут",16,"Сбрось все свои шмотки и всю свою руку",
                "Не преследует Манчкинов 3-го уровня и ниже. Более развитые герои, если не смогли победить  теряют два уровня",4,2);

        d1[1] =new DoorCard("Монстр",true,"Рука-ползунья",5,"Недетские андедские приколы лишают  тебя 2 уровней!",
                "Если отдашь ей хотельное кольцо вместо того, чтобы лезть в  драку, это станет началом прекрасной дружбы. " +
                        "Кольцо сбрось, руку оставь  себе: она считается мелкой шмоткой с бонусом +3",2,1);

        d1[2] =new DoorCard("Монстр",false,"Снеговичище",15,"он гасит все твои огненные/пламенные шмотки - сбрось их",
                "Огненные/пламенные  шмотки  дают против него удвоенный урон",4,2);

        d1[3] =new DoorCard("Монстр",true,"Жуткие клоуны",9,"нахохотался до полусмерти. Потеряй 3 уровня",
                "+5 против хафлингов",3,1);




//----------------------------------------------------------------------------------------------

        System.out.println("");

        for(int i = 0; i < d1.length; i++){
            System.out.println("");
            System.out.print("Card "+(i+1)+"/" + d1.length);
            d1[i].getInfo();
        }


        System.out.println("");
        sm.getWaitMenu();

   // Считываем действие пользователя
        String sAction = null; // Переменная с текстом который ввел пользователь
        int nAction = 1; //
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            sAction = reader.readLine();
            nAction = Integer.parseInt(sAction);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        switch(nAction) {
            case 1:
                System.out.println("Активировано меню выбора экипировки");
                break;
            default:
                System.out.println("Указан ошибочный пункт меню");
                break;
        }

    }
}

