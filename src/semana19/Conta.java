package semana19;

import java.time.LocalDate;

public abstract class Conta {
    
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;
    
    public Conta (int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
        correntista.addConta(this);
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public Correntista getCorrentista() {
        return this.correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public void sacar(double valor) throws IllegalAccessException {
        if (valor > saldo) {
            throw new IllegalAccessException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public double calcularTarifa() {
        return tarifa;
    }

}