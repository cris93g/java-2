package burger_shop;

import java.util.ArrayList;

public class Burger {
    private String name;
    public Meat meat;
    private Bread bread;
    private String[]toppings={null,null};
    public double burgerPrice=5.00;
    private double toppingPrice;


    public Burger(String name,Meat meat,Bread bread) {
        this.name=name;
        this.meat=meat;
        this.bread=bread;
    }
    public void newToppings(String firstT,String secondT){
        String[] toppingsArray={"bacon","lettuce","tomatoes","carrots","mustard","ketchup","relish","guacamole","cheese","mayonnaise"};
        for(String item : toppingsArray){
           if(firstT.equals(item)){
               this.toppings[0]=item;
               this.toppingPrice+=.50;
           }
           if(secondT.equals(item)){
               this.toppings[1]=item;
               this.toppingPrice+=.50;
           }
        }
    }


    public void getBread1(){
        bread.getBread();
    }
    public void getMeat1(){
        meat.getMeat();
    }
    public void getToppings(){
        System.out.printf("first topping is %s and second is %s",this.toppings[0],this.toppings[1]);
    }
    public void getBurgerPrice(){
        System.out.printf("%f",burgerPrice);
    }
    public void getFullPrice(){
        double top=toppingPrice;
        double sumOfAll=top+burgerPrice;
        System.out.printf("all right so ur burger with %s and %s is going to be $%f dollars %n",this.toppings[0],this.toppings[1],sumOfAll);
    }

}
