package semana12;

public class Circulo {
    // Atributos
    public double raio;

    // Construtores    
    public Circulo() {
    }

    public Circulo(double raio){
        this.raio = raio;
    }

    // Métodos
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
