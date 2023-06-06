package semana14;

public class Quadrado {
    // Atributos
    public double lado;

    // Construtor
    public Quadrado(double lado) {
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    // Métodos
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Get
    // public TIPO ATRIBUTO getNOME_DO_ATRIBUTO() {
    // return ATRIBUTO;
    // }

    // Set
    // public void setNOME_DO_ATRIBUTO( TIPO ATRIBUTO NOME_DO_ATRIBUTO) {
    // this.NOME_DO_ATRIBUTO = NOME_DO_ATRIBUTO;
    // }

    public void setLado(double lado) {
        if (lado <= 0.0) {
            throw new RuntimeException("Lado Inválido");
        }

        this.lado = lado;
    }
}