package sem7.Decorator;

public class ComplexNumber{
    private double real;
    private double image;

    public ComplexNumber(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public String toString() {
       if(image >= 0){
        return real + "+" + image + "i";
       } else {
        return real + "-" + -image + "i";}
    }
    
    
}
