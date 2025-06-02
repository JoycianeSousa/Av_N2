package FormasGeometricasPlanas;

public class Hexangono extends figuraPlana{
    private double lado;

    public Hexangono() {
    	lado = 10;
    	
    } public void setLado(double pLado) {
        lado = pLado;
    } public double getLado() {
    	return lado;
    } public void calcArea() {
        area = (3 * Math.sqrt(3) * (lado * lado)) / 2;
    }
}