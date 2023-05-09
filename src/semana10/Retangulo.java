package semana10;

//Classe
public class Retangulo {

    //Atributos
    public double base;
    public double altura;

    //Metodos    
    public Retangulo() {
    }

    public Retangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return this.base * this.altura;
    }

    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
    
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
    
}