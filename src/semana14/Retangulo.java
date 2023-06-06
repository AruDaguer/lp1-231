package semana14;

public class Retangulo {
    // Atributos
    public double base;
    public double altura;

    // Construtor
    public Retangulo(double base, double altura) {
        setAltura(altura);
        setBase(base);
    }

    // Get
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    // Set
    public void setBase(double base) {
        if (base <= 0.0) {
            throw new RuntimeException("Base Inválida");
        }

        this.base = base;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Altura Inválida");
        }

        this.base = altura;
    }

    // Métodos
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
