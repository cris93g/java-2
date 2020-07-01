package burger_shop;

public class Side {
    private String sideName;
    private String side;
    private final String[] sideArray={"fries", "chips", "apple pie", "ice cream"};
    public Side(String sideName) {
        for(String item: sideArray){
            if(item.equals(sideName)){
                this.side=sideName;
                break;
            }
        }
    }

    public void getSide(){
        System.out.printf("%s %n",side);
    }
}
