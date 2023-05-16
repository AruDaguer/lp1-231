package semana12.exercicios.exercicio01;

public class Aquario {
    // Atributos
    double comprimento = 0.0;
    double altura = 0.0;
    double largura = 0.0;

    // Construtores
    public Aquario(double comprimento, double altura, double largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Aquario(double valor) {
        this.comprimento = valor;
        this.altura = valor;
        this.largura = valor;
    }

    // Métodos
    public double calcularVolume() {
        return ((comprimento * altura * largura) / 1000);
    }

    public double calcularPotenciaDoTermostato( double temperaturaAmbiente, double temperaturaDesejada ) {
        return (calcularVolume() * 0.05 * (temperaturaAmbiente - temperaturaDesejada)); 
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] array1 = {calcularVolume() * 3, calcularVolume() * 2};
        return array1;
    }
}    
