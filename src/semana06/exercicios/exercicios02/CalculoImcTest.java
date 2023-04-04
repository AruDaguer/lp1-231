package semana06.exercicios.exercicios02;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoImcTest {

    // Calculo do IMC

    @Test
    public void testarCalculoImcBaixoPeso() {
        float peso = 30f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(11.718749f, imc);

    }

    @Test
    public void testarCalculoImcPesoNormal() {
        float peso = 56f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(21.874998f, imc);

    }

    @Test
    public void testarCalculoImcExcessoPeso() {
        float peso = 70f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(27.343748f, imc);

    }

    @Test
    public void testarCalculoImcObesidade1() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998f, imc);

    }

    @Test
    public void testarCalculoImcObesidade2() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998f, imc);

    }

    @Test
    public void testarCalculoImcObesidade3() {
        float peso = 80f;
        float altura = 1.6f;
        float imc = CalculoImc.CalcularImc(peso, altura);
        assertEquals(31.249998f, imc);

    }

    // Determinar Categoria

    @Test    
    public void testarCategoriaBaixoPeso1() {
        float imc = 18.4f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Baixo peso".toCharArray());
    }

    @Test
    public void testarCategoriaBaixoPeso2() {
        float imc = 10f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Baixo peso".toCharArray());
    }

    @Test
    public void testarCategoriaPesoNormal1() {
        float imc = 18.6f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Peso normal".toCharArray());
    }

    @Test
    public void testarCategoriaPesoNormal2() {
        float imc = 24.9f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Peso normal".toCharArray());
    }

    @Test
    public void testarCategoriaExcessoPeso1() {
        float imc = 25.1f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Excesso de peso".toCharArray());
    }

    @Test
    public void testarCategoriaExcessoPeso2() {
        float imc = 29.9f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Excesso de peso".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade11() {
        float imc = 30f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 1".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade12() {
        float imc = 34.9f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 1".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade21() {
        float imc = 35f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 2".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade22() {
        float imc = 39.9f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 2".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade31() {
        float imc = 40f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 3".toCharArray());
    }

    @Test
    public void testarCategoriaObesidade32() {
        float imc = 50f;
        String categoria = CalculoImc.CalcularCategoria(imc);
        assertArrayEquals(categoria.toCharArray(), "Obesidade de Classe 3".toCharArray());
    }
}