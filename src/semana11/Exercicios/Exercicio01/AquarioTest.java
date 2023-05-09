package semana11.Exercicios.Exercicio01;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AquarioTest {
    
    @Test
    public void calcularVolumeTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 10.0;
        aquario.altura = 10.0;
        aquario.largura = 10.0;

        double volume = aquario.calcularVolume();

        assertEquals(1.0, volume);
    }

    @Test
    public void calcularPotenciaDoTermostatoTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 10.0;
        aquario.altura = 10.0;
        aquario.largura = 10.0;

        double potencia = aquario.calcularPotenciaDoTermostato(30.0,25.0);
        
        assertEquals(0.25, potencia);
    }

    @Test
    public void calcularQuantidadeLitrosFiltroMaximoTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 10.0;
        aquario.altura = 10.0;
        aquario.largura = 10.0;

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double maximo = filtragem[0];

        assertEquals(3, maximo);

    }

    @Test
    public void calcularQuantidadeLitrosFiltroMinimoTest() {
        Aquario aquario = new Aquario();
        aquario.comprimento = 10.0;
        aquario.altura = 10.0;
        aquario.largura = 10.0;

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double minimo = filtragem[1];

        assertEquals(2, minimo);

    }

}
