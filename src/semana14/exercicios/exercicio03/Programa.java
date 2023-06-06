package semana14.exercicios.exercicio03;

public class Programa {
    public static void main(String[] args) {
        Conta conta = new Conta(1, "Alfredo");
        Conta conta1 = new Conta(2, "Marcela");
        Conta conta2 = new Conta(3, "Junior");
        // Conta conta3 = new Conta(4, "Patrícia");

        // TESTES

        // DEPOSITO
        conta.depositar(20000.0);
        conta1.depositar(15000.0);
        conta2.depositar(46000.0);

        // SAQUE
        conta.sacar(20.0);
        conta1.sacar(350.0);
        conta2.sacar(5.5);

        // TRANSFERÊNCIA
        conta.transferir(100.0, conta1);
        conta.transferir(20.5, conta2);
        conta1.transferir(50.5, conta);
        conta1.transferir(250.0, conta2);
        conta2.transferir(400.0, conta);
        conta2.transferir(600.0, conta1);

        // VER EXTRATO
        conta.verSaldo();
        conta1.verSaldo();
        conta2.verSaldo();

        // ERROS
        // conta3.depositar(-10.0);
        // conta3.sacar(10.0);
    }
}
