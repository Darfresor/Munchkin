public class treasureCard {
    String GeneralCardType; // общий тип карты
    String   NameCard;
    Integer Bonus;
    Integer Cost;
    String TypeOfTreasure; //  тип сокровища
    Integer CountOfHand; //кол-во занятых рук
    Boolean IsBigSize; //Большая/малая карта
    String constraints;  // ограничения
    String description; // описание



    public 	treasureCard(String NameCard,Integer Bonus, Integer Cost, String TypeOfTreasure, Integer CountOfHand, Boolean IsBigSize, String constraints,String description) {
        this.GeneralCardType="Сокровища";
        this.NameCard=NameCard;
        this.Bonus=Bonus;
        this.Cost=Cost;
        this.TypeOfTreasure=TypeOfTreasure;
        this.CountOfHand=CountOfHand;
        this.IsBigSize=IsBigSize;
        this.constraints=constraints;
        this.description=description;
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
        System.out.println("description: "+ description);
    }



}
