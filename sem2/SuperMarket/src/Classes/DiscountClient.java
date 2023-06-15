package Classes;

public class DiscountClient extends Actor{
    private String discountName;
    private int idDisc;
    static int clientCount;  // тут подумать

    public DiscountClient(String name, String discountName, int idDisc) {
        super(name);
        this.discountName = discountName;
        this.idDisc = idDisc;
        clientCount = 10; // тут подумать
    }

    public String getDiscName() {
        return discountName;
    }

    public int getIdDisc() {
        return idDisc;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        super.isTakeOrder = takeOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }
    
    

}
