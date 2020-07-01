package burger_shop;

public class DeluxeBurger extends Burger {
    private String[]deluxeToppings={null,null,null,null,null,null};
    private double deluxeToppingPrice;
    public DeluxeBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);
    }
    public void addDeluxToppings(String firstT, String secondT,String thirdT, String fourthT,String fithT,String sixthT) {
        String[] toppingsArray={"bacon","lettuce","tomatoes","carrots","mustard","ketchup","relish","guacamole","cheese","mayonnaise"};
        for(String item : toppingsArray){
            if(firstT.equals(item)){
                this.deluxeToppings[0]=item;
                this.deluxeToppingPrice+=.50;
            }
            if(secondT.equals(item)){
                this.deluxeToppings[1]=item;
                this.deluxeToppingPrice+=.50;
            }
            if(thirdT.equals(item)){
                this.deluxeToppings[2]=item;
                this.deluxeToppingPrice+=.50;
            }
            if(fourthT.equals(item)){
                this.deluxeToppings[3]=item;
                this.deluxeToppingPrice+=.50;
            }
            if(fourthT.equals(item)){
                this.deluxeToppings[4]=item;
                this.deluxeToppingPrice+=.50;
            }
            if(fourthT.equals(item)){
                this.deluxeToppings[5]=item;
                this.deluxeToppingPrice+=.50;
            }
        }
    }
    public void getDelux(){
        double fullPrice=burgerPrice+deluxeToppingPrice;
        System.out.printf("all right so ur delux burger with %s,%s,%s,%s,%s and %s is going to be $%f dollars %n",this.deluxeToppings[0],this.deluxeToppings[1],this.deluxeToppings[2],this.deluxeToppings[3],this.deluxeToppings[4],this.deluxeToppings[5],fullPrice);
    }
}
