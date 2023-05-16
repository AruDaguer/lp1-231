package semana12.exercicios.exercicio03;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void depositarTest() {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        double saldo = conta.depositar(2500.0);

        assertEquals(2500.0, saldo);
    }
    
    @Test
    public void depositarTestErro() throws Exception {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            conta.depositar(-250.0);
        });
        
        String erro = "Dinheiro inválido para depósito";
        String mensagem = exception.getMessage();

        assertEquals(erro, mensagem);
    }

    @Test
    public void sacarTest() {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        conta.depositar(2500.0);
        double saldo = conta.sacar(100.0);

        assertEquals(2400.0, saldo);
    }

    @Test
    public void sacarTestErro() throws Exception {
        int codigo = 1;
        String nome = "Jorge";
        Conta conta = new Conta(codigo, nome);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            conta.sacar(100.0);
        });
        
        String erro = "Saldo insuficiente para saque";
        String mensagem = exception.getMessage();

        assertEquals(erro, mensagem);
    }

    @Test
    public void transferirTest() {
        int codigo = 1;
        String nome = "Jorge";
        int codigo1 = 2;
        String nome1 = "Julia";
        Conta conta = new Conta(codigo, nome);
        Conta conta2 = new Conta(codigo1, nome1);

        conta.depositar(2500.0);
        double[] transferencia = conta.transferir(500.0, conta2);
        double[] arraycerto = {2000.0, 500.0};
        assertArrayEquals(arraycerto, transferencia);
    }
}
