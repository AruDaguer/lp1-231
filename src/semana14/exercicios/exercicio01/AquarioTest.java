package semana14.exercicios.exercicio01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AquarioTest {

    @Test
    public void calcularVolumeTest() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);

        double volume = aquario.calcularVolume();

        assertEquals(24.0, volume);
    }

    @Test
    public void calcularPotenciaDoTermostatoPositivaTest() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);

        double potencia = aquario.calcularPotenciaDoTermostato(30.0, 25.0);

        assertEquals(6.000000000000001, potencia);
    }

    @Test
    public void calcularPotenciaDoTermostatoNegativaTest() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);

        double potencia = aquario.calcularPotenciaDoTermostato(25.0, 30.0);

        assertEquals(-6.000000000000001, potencia);
    }

    @Test
    public void calcularQuantidadeLitrosFiltroMaximoTest() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double maximo = filtragem[0];

        assertEquals(72, maximo);

    }

    @Test
    public void calcularQuantidadeLitrosFiltroMinimoTest() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double minimo = filtragem[1];

        assertEquals(48, minimo);

    }

    @Test
    public void calcularVolumeTestUmValor() {
        Aquario aquario = new Aquario(10.0);

        double volume = aquario.calcularVolume();

        assertEquals(1.0, volume);
    }

    @Test
    public void calcularPotenciaDoTermostatoPositivaTestUmValor() {
        Aquario aquario = new Aquario(10.0);

        double potencia = aquario.calcularPotenciaDoTermostato(30.0, 25.0);

        assertEquals(0.25, potencia);
    }

    @Test
    public void calcularPotenciaDoTermostatoNegativaTestUmValor() {
        Aquario aquario = new Aquario(10.0);

        double potencia = aquario.calcularPotenciaDoTermostato(25.0, 30.0);

        assertEquals(-0.25, potencia);
    }

    @Test
    public void calcularQuantidadeLitrosFiltroMaximoTestUmValor() {
        Aquario aquario = new Aquario(10.0);

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double maximo = filtragem[0];

        assertEquals(3, maximo);

    }

    @Test
    public void calcularQuantidadeLitrosFiltroMinimoTestUmValor() {
        Aquario aquario = new Aquario(10.0);

        double[] filtragem = aquario.calcularQuantidadeLitrosFiltro();
        double minimo = filtragem[1];

        assertEquals(2, minimo);

    }
    
    @Test
    public void construirAquarioComValorNegativo() {
        assertThrows(RuntimeException.class, () -> new Aquario(-30.0, -40.0, -20.0));
    }
    
    @Test
    public void construirAquarioComUmValorNegativo() {
        assertThrows(RuntimeException.class, () -> new Aquario(-10.0));
    }
    
    @Test
    public void settarLarguraComValorNegativo() {
        assertThrows(RuntimeException.class, () -> {
            Aquario aquario = new Aquario(30.0, 40.0, 20.0);
            aquario.setLargura(-10);
        });
    }
    
    @Test
    public void settarAlturaComValorNegativo() {
        assertThrows(RuntimeException.class, () -> {
            Aquario aquario = new Aquario(30.0, 40.0, 20.0);
            aquario.setAltura(-10);
        });
    }
    
    @Test
    public void settarComprimentoComValorNegativo() {
        assertThrows(RuntimeException.class, () -> {
            Aquario aquario = new Aquario(30.0, 40.0, 20.0);
            aquario.setComprimento(-10);
        });
    }
    
    @Test
    public void construirAquarioComValorPositivo() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);
        assertEquals(aquario.getAltura(), 40.0);
    }

    @Test
    public void construirAquarioComUmValorPositivo() {
        Aquario aquario = new Aquario(10);
        assertEquals(aquario.getAltura(), 10.0);
    }

    @Test
    public void settarLarguraComValorPositivo() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);
        aquario.setLargura(10);
        assertEquals(aquario.getLargura(), 10.0);
    }
    
    @Test
    public void settarAlturaComValorPositivo() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);
        aquario.setAltura(10);
        assertEquals(aquario.getAltura(), 10.0);
    }
    
    @Test
    public void settarComprimentoComValorPositivo() {
        Aquario aquario = new Aquario(30.0, 40.0, 20.0);
        aquario.setComprimento(10);
        assertEquals(aquario.getComprimento(), 10.0);
    }
    
}
