package sem7.Decorator;

public class Calculator implements iCalculable{
    private ComplexNumber compNum1;
    private ComplexNumber compNum2;

    public Calculator(ComplexNumber compNum1, ComplexNumber compNum2) {
        this.compNum1 = compNum1;
        this.compNum2 = compNum2;
    }

    @Override
    public iCalculable sum(ComplexNumber compNum1, ComplexNumber compNum2) {
        ComplexNumber sum = new ComplexNumber(0, 0);
        sum.setReal(compNum1.getReal() + compNum2.getReal());
        sum.setImage(compNum1.getImage() + compNum2.getImage());
       
       return sum.toString();
        
    }

    @Override
    public iCalculable multi(ComplexNumber compNum1, ComplexNumber compNum2) {
        ComplexNumber mult = new ComplexNumber(0, 0);
        mult.setReal(compNum1.getReal()*compNum2.getReal() - compNum1.getImage()*compNum2.getImage());
        mult.setImage(compNum1.getImage()*compNum2.getReal() + compNum1.getReal()*compNum2.getImage());

        return mult.toString();
    }

    @Override
    public iCalculable divide(ComplexNumber compNum1, ComplexNumber compNum2){
        ComplexNumber div = new ComplexNumber(0, 0);
        double dRe, dIm;
        if(Math.abs( compNum2.getReal() ) >= Math.abs( compNum2.getImage() )) {
            dRe   = compNum2.getImage()/compNum2.getReal();
            dIm = compNum2.getReal() + dRe*compNum2.getImage();
            div.setReal((compNum1.getReal() + dRe*compNum1.getImage())/dIm);
            div.setImage((compNum1.getImage() - dRe*compNum1.getReal())/dIm);
        } 
        else {
            dRe   = compNum2.getReal()/compNum2.getImage();
            dIm = compNum2.getImage() + dRe*compNum2.getReal();   
            div.setReal((dRe*compNum1.getReal() + compNum1.getImage())/dIm);  
            div.setImage((dRe*compNum1.getImage() - compNum1.getReal())/dIm); 
        }

        return div.toString();
    }

    @Override
    public iCalculable getResult() {
        return compNum1;
    }


}
