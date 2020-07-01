package burger_shop;

public class Meat {
    private String meatType;
    public Meat(String meatType){
        String[] meatArray = { "beef", "chicken", "black bean", "turkey", "soy" };
        for (String item : meatArray) {
            if (meatType.equals(item)) {
                this.meatType = meatType;
                break;
            }
        }
    }
    public void getMeat() {
        System.out.printf("this is my meat %s", meatType);
    }
}
