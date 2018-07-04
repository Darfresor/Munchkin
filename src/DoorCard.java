public class DoorCard {
    String GeneralCardType; // общий тип карты
    String typeCard; //основной тип карты
    Boolean isUndead; // нежить ли?
    String NameCard;
    Integer LevelOfMonster;
    Integer  fightingPower; //боевая сила карты
    String impact; //  воздействие на игрока(непотребство)
    String description; // описание
    Integer CountOftreasure; //  количество сокровищ
    Integer BonusLevel; // дополнительное увеличение уровня при определенных обстоятельствах


    public DoorCard(String typeCard, Boolean isUndead, String NameCard, Integer LevelOfMonster, String impact, String description, Integer CountOftreasure,Integer BonusLevel) {
        this.GeneralCardType="Дверь";
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
     GeneralCardType="Äâåðü";
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
