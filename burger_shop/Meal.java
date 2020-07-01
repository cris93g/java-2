package burger_shop;

public class Meal {
    private Drink drink;
    private  Side side;
    private  Burger burger;
    public Meat meat;
    public Meal(Drink drink, Side side, Burger burger) {
        this.drink = drink;
        this.side = side;
        this.burger = burger;
    }
    public Drink getDrink() {
        return drink;
    }
    public Side getSide() {
        return side;
    }
    public void getMeat() {
        burger.getBread1();
    }
    public Burger getBurger() {
        return burger;
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
}
