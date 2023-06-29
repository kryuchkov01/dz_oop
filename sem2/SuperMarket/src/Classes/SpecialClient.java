package Classes;

import Intefaces.iReturnOrder;

public class SpecialClient extends Actor implements iReturnOrder{

    private int idVip;

    public SpecialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVip() {
        return idVip;
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
