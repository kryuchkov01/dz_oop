package sem7.Decorator;

public class CalcDecorator implements iCalculable{
    private iCalculable oldCalc;
    private Logger logger;
    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

     @Override
    public iCalculable sum(ComplexNumber arg1, ComplexNumber arg2) {
        int arg1 = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", arg1, arg2));
        iCalculable result = oldCalc.sum(arg1,arg2);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(ComplexNumber arg1, ComplexNumber arg2) {
        int arg1 = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", arg1, arg2));
        iCalculable result = oldCalc.multi(arg1,arg2);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public iCalculable divide(ComplexNumber arg1, ComplexNumber arg2) {
        int arg1 = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода divide с параметром %d", arg1, arg2));
        iCalculable result = oldCalc.divide(arg1,arg2);
        logger.log(String.format("Вызова метода divide произошел"));
        return result;
    }

    @Override
    public int getResult() {
        int result = oldCalc.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }
}
