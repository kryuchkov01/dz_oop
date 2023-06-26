package sem6.z4;

public class Rectangle extends Width{

    private int height;

    public Rectangle(int width) {
        super(width);
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    public int areaRec() {
        return super.width * this.height;
    }
}
