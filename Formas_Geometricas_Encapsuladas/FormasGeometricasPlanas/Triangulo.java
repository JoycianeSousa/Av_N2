package FormasGeometricasPlanas;

public class Triangulo {
	private double base;
    private double altura;
    private double area;

    public Triangulo() {
    	base = 10;
    	altura = 10;
    	area = 0;
    	
    } public void setBase(double pBase) {
        base = pBase;
    } public double getBase() {
        return base;
    } public void setAltura(double pAltura) {
        altura = pAltura;
    } public double getAltura() {
        return altura;
    } public void calcArea() {
        area = (base * altura) / 2;
    } public void mostrarArea() {
        System.out.println("Área: " + area);
    } public double getArea() {
        System.out.println("Área com retorno: " + area);
        return area;
    }
	public void setAltura(int pAltura) {
		// TODO Auto-generated method stub
		
	}
}
