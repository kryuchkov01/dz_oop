package sem7.Factory;

public abstract class iItemGenerator{

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    
    public abstract iGameItem createItem();
}
