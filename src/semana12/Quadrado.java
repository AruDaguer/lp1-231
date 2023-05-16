package semana12;

public class Quadrado {
    // Atributos
    public double lado;

    // Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Métodos
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
} 