package semana14.exercicios.exercicio03;

public class Conta {
    // Atributos
    private int codigo;
    private double saldo;
    private String correntista;

    // Construtores
    public Conta(int codigo, String correntista) {
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    // Get
    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCorrentista() {
        return correntista;
    }

    // Set
    public void setCodigo(int codigo) {
        if (codigo <= 0.0) {
            throw new RuntimeException("Codigo Inválido");
        }

        this.codigo = codigo;
    }

    public void setCorrentista(String correntista) {
        if (Double.parseDouble(correntista) < 5 || Double.parseDouble(correntista) > 100) {
            throw new RuntimeException("Tamanho Inválido");
        }

        this.correntista = correntista;
    }

    // Métodos
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito");
        }

        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado para " + correntista);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para saque");
        }

        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado por " + correntista);
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para transferência");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência");
        }

        destino.depositar(valor);
        saldo -= valor;
        System.out.println(
                "Transferência de R$" + valor + " realizada de " + correntista + " para " + destino.getCorrentista());
        System.out.println("Saldo atual de " + correntista + ": R$" + saldo);
        System.out.println("Saldo atual de " + destino.getCorrentista() + ": R$" + destino.getSaldo());
    }

    public void verSaldo() {
        System.out.println("Saldo de " + correntista);
        System.out.println("Saldo atual: R$" + saldo);
    }
}