package sem7.Decorator;

public interface iCalculable {
    iCalculable sum(ComplexNumber arg1, ComplexNumber arg2);
    iCalculable multi(ComplexNumber arg1, ComplexNumber arg2);
    iCalculable divide(ComplexNumber arg1, ComplexNumber arg2);
    iCalculable getResult();
}
