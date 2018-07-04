public class characterCard {
    String GeneralCardType;
    String NickName; // псевдоним
    String gender; // пол мужской/женский/неопределен
    Integer level; // уровень
    Integer  fightingPower; //боевая сила - уровень +шмотки + усилители
    String race;  // расса
    String profession; // класса
    String head; //голова
    String body; //тело
    String leftHand; // левая рука
    String rightHand; // правая рука
    String Legs; // ноги
    String TheBlessing; //благословления
    String Curses; //проклятия
    String inventory; //инвентарь
    String  hiddenCArd; // карты на руках



    public characterCard(String NickName, String gender, Integer level, String race) {
        this.GeneralCardType="Персонаж";
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
