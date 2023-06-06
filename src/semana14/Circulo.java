package semana14;

public class Circulo {
    // Atributos
    public double raio;

    // Construtores
    public Circulo() {
    }

    public Circulo(double raio) {
        setRaio(raio);
    }

    // Get
    public double getRaio() {
        return raio;
    }

    // Set
    public void setRaio(double raio) {
        if (raio <= 0.0) {
            throw new RuntimeException("Raio Inválida");
        }

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
