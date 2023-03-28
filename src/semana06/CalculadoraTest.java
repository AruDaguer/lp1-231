package semana06;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void somaDoisNumerosPositivos() {
        // AAA
        // Arrange
        double n1 = 10.0;
        double n2 = 2.0;

        // Act
        double soma = Calculadora.somar(n1, n2);

        // Assert
        assertEquals(12.0, soma);

    }

    @Test
    public void somaDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;
        double soma = Calculadora.somar(n1, n2);
        assertEquals(-12.0, soma);

    }

    @Test
    public void somaDoisNumerosPositivoNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;
        double soma = Calculadora.somar(n1, n2);
        assertEquals(8.0, soma);

    }

    @Test
    public void somaDoisNumerosNegativoPositivo() {
        double n1 = -10.0;
        double n2 = 2.0;
        double soma = Calculadora.somar(n1, n2);
        assertEquals(-8.0, soma);

    }

    @Test
    public void subtraiDoisNumerosPositivos() {
        double n1 = 10.0;
        double n2 = 2.0;
        double subtracao = Calculadora.subtrair(n1, n2);
        assertEquals(8.0, subtracao);

    }

    @Test
    public void subtraiDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;
        double subtracao = Calculadora.subtrair(n1, n2);
        assertEquals(-8.0, subtracao);

    }

    @Test
    public void subtraiDoisNumerosPositivoNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;
        double subtracao = Calculadora.subtrair(n1, n2);
        assertEquals(12.0, subtracao);

    }

    @Test
    public void subtraiDoisNumerosNegativoPositivo() {
        double n1 = -10.0;
        double n2 = 2.0;
        double subtracao = Calculadora.subtrair(n1, n2);
        assertEquals(-12.0, subtracao);

    }

    @Test
    public void multiplicacaoDoisNumerosPositivos() {
        double n1 = 10.0;
        double n2 = 2.0;
        double multiplicacao = Calculadora.multiplicar(n1, n2);
        assertEquals(20.0, multiplicacao);

    }

    @Test
    public void multiplicacaoDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;
        double multiplicacao = Calculadora.multiplicar(n1, n2);
        assertEquals(-20.0, multiplicacao);

    }

    @Test
    public void multiplicacaoDoisNumerosPositivoNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;
        double multiplicacao = Calculadora.multiplicar(n1, n2);
        assertEquals(-20.0, multiplicacao);

    }

    @Test
    public void multiplicacaoDoisNumerosNegativoPositivo() {
        double n1 = -10.0;
        double n2 = 2.0;
        double multiplicacao = Calculadora.multiplicar(n1, n2);
        assertEquals(-20.0, multiplicacao);

    }

    @Test
    public void divisaoDoisNumerosPositivos() {
        double n1 = 10.0;
        double n2 = 2.0;
        double divisao = Calculadora.dividir(n1, n2);
        assertEquals(5.0, divisao);

    }

    @Test
    public void divisaoDoisNumerosNegativos() {
        double n1 = -10.0;
        double n2 = -2.0;
        double divisao = Calculadora.dividir(n1, n2);
        assertEquals(5.0, divisao);

    }

    @Test
    public void divisaoDoisNumerosPositivoNegativo() {
        double n1 = 10.0;
        double n2 = -2.0;
        double divisao = Calculadora.dividir(n1, n2);
        assertEquals(-5.0, divisao);

    }

    @Test
    public void divisaoDoisNumerosNegativoPositivo() {
        double n1 = -10.0;
        double n2 = 2.0;
        double divisao = Calculadora.dividir(n1, n2);
        assertEquals(-5.0, divisao);

    }

    @Test
    public void divisaoDoisNumerosPositivoZero() {
        double n1 = 10.0;
        double n2 = 0;
        double divisao = Calculadora.dividir(n1, n2);
        assertEquals(-5.0, divisao);

    }
    


    
}
