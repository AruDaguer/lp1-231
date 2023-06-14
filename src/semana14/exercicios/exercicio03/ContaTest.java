package semana14.exercicios.exercicio03;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void depositarTest() {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        conta.depositar(2500.0);

        assertEquals(2500.0, conta.getSaldo());
    }

    @Test
    public void depositarTestErro() throws Exception {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.depositar(-250.0);
        });

        String erro = "Valor inválido para depósito";
        String mensagem = exception.getMessage();

        assertEquals(erro, mensagem);
    }

    @Test
    public void sacarTest() {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        conta.depositar(2500.0);
        conta.sacar(100.0);

        assertEquals(2400.0, conta.getSaldo());
    }

    @Test
    public void sacarTestErro() throws Exception {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            conta.sacar(100.0);
        });

        String erro = "Saldo insuficiente para saque";
        String mensagem = exception.getMessage();

        assertEquals(erro, mensagem);
    }

    @Test
    public void transferirTestContaOrigem() {
        int codigo = 1;
        String nome = "Jorge";
        int codigo1 = 2;
        String nome1 = "Julia";
        Conta conta = new Conta(codigo, nome);
        Conta conta2 = new Conta(codigo1, nome1);

        conta.depositar(2500.0);
        conta.transferir(500.0, conta2);

        assertEquals(2000.0, conta.getSaldo());
    }

    @Test
    public void transferirTestContaDestino() {
        int codigo = 1;
        String nome = "Jorge";
        int codigo1 = 2;
        String nome1 = "Julia";
        Conta conta = new Conta(codigo, nome);
        Conta conta2 = new Conta(codigo1, nome1);

        conta.depositar(2500.0);
        conta.transferir(500.0, conta2);

        assertEquals(500.0, conta2.getSaldo());
    }
     
    @Test
    public void construirContaComValorNegativo() {
        assertThrows(RuntimeException.class, () -> new Conta(-1, "Jorge"));
    }
    
    @Test
    public void construirContaComNomeMenorQueCinco() {
        assertThrows(RuntimeException.class, () -> new Conta(-1, "Joge"));
    }

    @Test
    public void construirContaComNomeMaiorQueCem() {
        assertThrows(RuntimeException.class, () -> new Conta(1, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris suscipit leo id massa luctus posuere. Vivamus eleifend nunc quis fringilla placerat. Fusce tristique diam eu tellus efficitur, ut posuere elit consequat. Phasellus commodo vulputate ligula, non luctus neque varius nec. Suspendisse tincidunt massa et augue laoreet, vel cursus libero rhoncus. In nec efficitur tellus, id posuere ligula. Aenean in augue id nulla rutrum vulputate. Suspendisse vitae arcu sit amet nunc lobortis ultrices ac vitae mi. Suspendisse potenti. Duis in lectus consectetur, tincidunt dui in, auctor velit. Cras dignissim orci sit amet quam congue, a luctus ex venenatis. Sed dignissim justo vel dui iaculis sagittis. Proin nec mauris a mi commodo semper."));
    }
    
    @Test
    public void getCodigoTest() {
        Conta conta = new Conta(1, "Jorge");
        assertEquals(conta.getCodigo(), 1);
    }
    
    @Test
    public void getCorrentistaTest() {
        Conta conta = new Conta(1, "Jorge");
        assertEquals(conta.getCorrentista(), "Jorge");
    }

}