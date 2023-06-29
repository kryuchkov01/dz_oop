package sem7.Factory;

public class GoldGenerator extends iItemGenerator{

    @Override
    public iGameItem createItem(){
        return new Gold();
    }
}
