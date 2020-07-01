package burger_shop;

public class Order {
    private Meal meal;
    private Burger burger;
    private Bread bread;
    private Drink drink;
    private  Side side;
    private Meat meat;
    private double price;
    public Order(Meal meal) {
        this.meal = meal;
    }
//    public Order(Burger burger, Bread bread, Meat meat) {
//        this.burger = burger;
//        this.bread = bread;
//        this.meat = meat;
//    }

    public Meal getMeal() {
        return meal;
    }

    public Burger getBurger() {
        return burger;
    }

    public void getBread() {
         burger.getBread1();
    }
    public void setBurger(Burger burger) {
        this.burger = burger;
    }
    public void setSide(Side side) {
        this.side = side;
    }
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    public Meat getMeat() {
        System.out.println(meat);
        return meat;
    }

    public void addBurger(Burger burger){
        this.meal.setBurger(burger);
    }
//    public void completePurchase(){
//        double idk =getPrice();
//        System.out.print(idk);
//        //System.out.printf("The total cost of ur parchase will be");
//    }
}