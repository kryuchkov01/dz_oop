package Classes;



import Intefaces.iActorBehaviour;
import Intefaces.iReturnOrder;

public class TaxService implements iActorBehaviour, iReturnOrder{

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    public TaxService() {
        this.name = "Tax audit";
    }

    public String getName() {        
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       isTakeOrder = pickUpOrder;   
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public void rejectOrder() {
        System.out.println("Оформлен отказ от заказа.");
    }

    @Override
    public void returnOrder() {
        System.out.println("Произведен возврат товара продавцу.");
    }

    @Override
    public void returnMoney() {
        System.out.println("Возвращены деньги на счет покупателя.");
    }
    
}
