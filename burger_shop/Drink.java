package burger_shop;

public class Drink {
    private String drinkName;
    private String drink;
    private final String[] drinkArray={"coke", "sprite", "dr pepper", "tea"};
    public Drink(String drinkName){
        for(String item: drinkArray){
            if(item.equals(drinkName)){
                this.drink=drinkName;
                break;
            }
        }
    }

}
