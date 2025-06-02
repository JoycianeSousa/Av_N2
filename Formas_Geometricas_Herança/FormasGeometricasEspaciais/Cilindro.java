package FormasGeometricasEspaciais;
public class Cilindro extends figuraEspacial{
    private double raio;
    private double altura;
    
    public Cilindro() {
    	raio = 10;
    	altura = 10;
    	
    } public void setRaio(double pRaio) {
		raio = pRaio;
	} public double getRaio() {
		return raio;
	} public void setAltura(double pAltura) {
		altura = pAltura;
	} public double getAltura() {
		return altura;
	} public void calcAreaBase() {
		areaBase = Math.PI * (raio * raio);
	} public void calcAreaTotalBase() {
		 areaTotalBase = 2 * Math.PI * (raio * raio);
	} public void calcAreaLateral() {
		areaLateral = Math.PI * raio * altura;
	} public void calcAreaTotal() {
		areaTotal = 2 * Math.PI * raio * (raio * altura);
	} public void calcVolume() {
		volume = Math.PI * (raio * raio) * altura;
	} public void calcArea(double pArea) {
		area = pArea;
	} public void calcDiagonal() {
		diagonal = diagonal;
	} public void calcAlturaa() {
		altura = altura;
	}
}