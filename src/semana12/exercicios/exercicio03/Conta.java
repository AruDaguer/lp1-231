package semana12.exercicios.exercicio03;

public class Conta {
    public int codigo;
    private double saldo = 0.0;
    public String correntista;

    public double getSaldo() {
        return saldo;
    }

    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public double depositar(double dinheiro) {
        if (dinheiro <= 0) {
            throw new IllegalArgumentException("Dinheiro inválido para depósito");
        } 
        saldo += dinheiro;
        System.out.println("Depositar: R$" + dinheiro);
        System.out.println("R$" + (saldo - dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
        return saldo;

    }

    public double sacar(double dinheiro) {
        if (dinheiro > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        saldo -= dinheiro; 
        System.out.println("Sacar: R$" + dinheiro);
        System.out.println("R$" + (saldo + dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
        return saldo;
    }

    public double[] transferir(double dinheiro, Conta conta) {
        if (dinheiro <= 0) {
            throw new IllegalArgumentException("Dinheiro inválido para depósito");
        } 
        if (dinheiro > dinheiro) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }
        conta.depositar(dinheiro);
        sacar(dinheiro);
        double[] saldos = {saldo, conta.getSaldo()};
        System.out.println("Tranferir: R$" + dinheiro);
        System.out.println("R$" + (saldo + dinheiro) + " --->" + " R$" + saldo);
        System.out.println("Saldo atual: R$" + saldo);
        return saldos;
    }
}
