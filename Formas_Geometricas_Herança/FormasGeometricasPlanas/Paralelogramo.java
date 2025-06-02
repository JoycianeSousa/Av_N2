
package FormasGeometricasPlanas;


	public class Paralelogramo extends figuraPlana{
	    private double base;
	    private double altura;

	    public Paralelogramo() {
	    	base = 10;
	    	altura = 10;
	    	
	    } public void setBase(double pBase) {
	        base = pBase;
	    } public double getBase() {
	        return base;
	    } public void setAltura(double pAltura) {
	        altura = pAltura;
	    } public double getAltura() {
	        return altura;
	    } public void calcArea() {
	        area = base * altura;
	    }
	}