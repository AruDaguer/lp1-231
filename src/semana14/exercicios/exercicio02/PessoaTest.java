package semana14.exercicios.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PessoaTest {

    @Test
    public void calcularImcTest() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);

        double imc = pessoa.calcularImc();

        assertEquals(24, imc);
    }

    @Test
    public void getFaixaTest() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);

        String faixa = pessoa.getFaixa();

        assertEquals("Peso normal", faixa);

    }

    @Test
    public void getSituacaoTest() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);

        String situacao = pessoa.getSituacao();

        assertEquals("NORMAL", situacao);
    }
}
