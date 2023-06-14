package semana14.exercicios.exercicio02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

        
    @Test
    public void construirPessoaComValorNegativo() {
        assertThrows(RuntimeException.class, () -> new Pessoa(-1.75, -73.5));
    }
    
    @Test
    public void construirPessoaComValorZero() {
        assertThrows(RuntimeException.class, () -> new Pessoa(0.0, 0.0));
    }
    
    @Test
    public void settarPesoComValorNegativo() {
        assertThrows(RuntimeException.class, () -> {
            Pessoa pessoa = new Pessoa(1.75, 73.5);
            pessoa.setPeso(-73.5);
        });
    }
    
    @Test
    public void settarAlturaComValorNegativo() {
        assertThrows(RuntimeException.class, () -> {
            Pessoa pessoa = new Pessoa(1.75, 73.5);
            pessoa.setAltura(-1.80);
        });
    }
    
    @Test
    public void construirPessoaComValorPositivo() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);
        assertEquals(pessoa.getAltura(), 1.75);
    }

    @Test
    public void settarPesoComValorPositivo() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);
        pessoa.setPeso(70);
        assertEquals(pessoa.getPeso(), 70);
    }
    
    @Test
    public void settarAlturaComValorPositivo() {
        Pessoa pessoa = new Pessoa(1.75, 73.5);
        pessoa.setAltura(70);
        assertEquals(pessoa.getAltura(), 70.0);
    }
}
