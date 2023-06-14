package semana14.exercicios.exercicio01;

public class Aquario {
    // Atributos
    double comprimento = 0.0;
    double altura = 0.0;
    double largura = 0.0;

    // Construtores
    public Aquario(double comprimento, double altura, double largura) {
        setComprimento(comprimento);
        setAltura(altura);
        setLargura(largura);
    }

    public Aquario(double valor) {
        setComprimento(valor);
        setAltura(valor);
        setLargura(valor);
    }

    // Get
    public double getComprimento() {
        return comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    // Set
    public void setComprimento(double comprimento) {
        if (comprimento <= 0.0) {
            throw new RuntimeException("Comprimento Inválido");
        }

        this.comprimento = comprimento;
    }

    public void setAltura(double altura) {
        if (altura <= 0.0) {
            throw new RuntimeException("Altura Inválido");
        }

        this.altura = altura;
    }

    public void setLargura(double largura) {
        if (largura <= 0.0) {
            throw new RuntimeException("Largura Inválido");
        }

        this.largura = largura;
    }

    // Métodos
    public double calcularVolume() {
        return ((comprimento * altura * largura) / 1000);
    }

    public double calcularPotenciaDoTermostato(double temperaturaAmbiente, double temperaturaDesejada) {
        return (calcularVolume() * 0.05 * (temperaturaAmbiente - temperaturaDesejada));
    }

    public double[] calcularQuantidadeLitrosFiltro() {
        double[] array1 = { calcularVolume() * 3, calcularVolume() * 2 };
        return array1;
    }
}
