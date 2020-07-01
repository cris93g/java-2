package burger_shop;

public class HealthBurger extends Burger {
    private String[]healthToppings={null,null,null,null};
    private double healthyToppingPrice;
    public HealthBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);
    }

    public void healthyToppings(String firstT, String secondT,String thirdT, String fourthT) {
        String[] toppingsArray={"lettuce","tomatoes","carrots","mustard","ketchup","relish","guacamole","cheese","mayonnaise"};
        for(String item : toppingsArray){
            if(firstT.equals(item)){
                this.healthToppings[0]=item;
                this.healthyToppingPrice+=.50;
            }
            if(secondT.equals(item)){
                this.healthToppings[1]=item;
                this.healthyToppingPrice+=.50;
            }
            if(thirdT.equals(item)){
                this.healthToppings[2]=item;
                this.healthyToppingPrice+=.50;
            }
            if(fourthT.equals(item)){
                this.healthToppings[3]=item;
                this.healthyToppingPrice+=.50;
            }
        }
    }



    public void getFullHealthyPrice() {
       double healthyTop=healthyToppingPrice;
       double burger=burgerPrice;
        double sum=burger+healthyTop;
        System.out.printf("all right so ur healthy burger with %s,%s,%s and %s is going to be $%f dollars %n",this.healthToppings[0],this.healthToppings[1],this.healthToppings[2],this.healthToppings[3],sum);
    }
}
