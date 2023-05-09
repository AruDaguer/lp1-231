package semana10;

//Classe
public class Circulo {

    //Atributos
    public double raio;

    //Metodos    
    public Circulo() {
    }

    public Circulo (double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    public static double calcularPerimetro(double raio) {
        return 2 * Math.PI * raio;
    }
    
}