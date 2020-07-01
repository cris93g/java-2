package burger_shop;

public class Bread {
    private String breadType;

    public Bread(String breadType) {
        String[] breadArray = { "white", "rye", "italian", "wheat", "sesame seed" };
        for (String item : breadArray) {
            if (breadType.equals(item)) {
                this.breadType = breadType;
                break;
            }
        }
    }
    public void getBread() {
        System.out.printf("this is my bread %s", breadType);
    }
}
