package FormasGeometricasPlanas;

public class Pentagono extends figuraPlana{
    private double perimetro;
    private double apotema;

    public Pentagono() {
    	perimetro = 10;
    	apotema = 10;
    	
    } public void setPerimetro(double pPerimetro) {
        perimetro = pPerimetro;
    } public double getPerimetro() {
        return perimetro;
    } public void setApotema(double pApotema) {
        apotema = pApotema;
    } public double getApotema() {
        return apotema;
    } public void calcArea() {
        area = (perimetro * apotema) / 2;
    }
}