package semana10;

//Classe
public class Quadrado{

    //Atributos
    public double lado;

    //Metodos    
    public Quadrado() {
    }

    public Quadrado (double lado){
        this.lado = lado;
    }

    public double calcularArea() {
        return Math.pow(lado, 2.0);
    }

    public double calcularPerimetro() {
        return lado * 4;
    }

    public static double calcularArea(double lado) {
        return Math.pow(lado, 2.0);
    }

    public static double calcularPerimetro(double lado) {
        return lado * 4;
    }
    
}
