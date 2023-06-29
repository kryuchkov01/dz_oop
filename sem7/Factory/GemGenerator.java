package sem7.Factory;

public class GemGenerator extends iItemGenerator{
    @Override
    public iGameItem createItem(){
        return new Gem();
    }
}
