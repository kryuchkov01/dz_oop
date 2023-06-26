package sem6.z4;

public class Square extends Rectangle{

    public Square(int width) {
        super(width);
        
    }

    public int areaSquare() {
        return super.width * super.width;
    }
    
}
