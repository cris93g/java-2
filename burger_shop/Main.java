package burger_shop;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Meat meat1=new Meat("chicken");
        Bread bread1= new Bread("white");
        Meat healthyMeat=new Meat("soy");
        Bread bread2 = new Bread("rye");
        Meat deluxMeat=new Meat("beef");
        Bread bread3 = new Bread("rye");
        Burger burger= new Burger("awesome", meat1, bread1);
        HealthBurger healthyChoice = new HealthBurger("health",healthyMeat, bread2);
        DeluxeBurger deluxOrder = new DeluxeBurger("delux", deluxMeat, bread3);
        burger.newToppings("lettuce", "tomatoes");
        burger.getFullPrice();
        healthyChoice.healthyToppings("lettuce", "tomatoes","carrots","ketchup");
        healthyChoice.getFullHealthyPrice();
        deluxOrder.addDeluxToppings("bacon","tomatoes","mustard","ketchup","carrots","cheese");
        deluxOrder.getDelux();
        Drink drinkCoke = new Drink("coke");
        Side sideFries = new Side("fries");
        sideFries.getSide();
        Meal meal1 = new Meal(drinkCoke, sideFries, burger);
        meal1.getMeat();
        meal1.setBurger(healthyChoice);
        meal1.getMeat();
        Order firstOrder= new Order(meal1);
        firstOrder.addBurger(deluxOrder);
        
    }

}
