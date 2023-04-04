public class NumberException extends Exception{
    private int numerador;
    private int denominador;

    public NumberException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
