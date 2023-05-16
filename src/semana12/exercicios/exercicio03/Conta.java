package semana12.exercicios.exercicio03;

public class Conta {
    int codigo;
    double saldo = 0.0;
    String correntista;
    String erro = "ERRO!";

    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double depositar(double dinheiro) {
        if (dinheiro <= 0) return -1; 
        saldo += dinheiro;
        System.out.println("Depositar: R$" + dinheiro);
        System.out.println("R$" + (saldo - dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
        return saldo;

    }

    public double sacar(double dinheiro) {
        if (dinheiro > dinheiro) return -1;
        saldo -= dinheiro; 
        System.out.println("Sacar: R$" + dinheiro);
        System.out.println("R$" + (saldo + dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
        return dinheiro;
    }

    public void transferir(double dinheiro, Conta conta) {
        conta.depositar(dinheiro);
        sacar(dinheiro);
        System.out.println("Depositar: R$" + dinheiro);
        System.out.println("R$" + (saldo - dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
    }
}
