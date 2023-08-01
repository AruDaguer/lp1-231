package semana17.Ex01;

public class Vendedor {

    protected String nome;
    protected double vendas;
    protected double comissao;

    public Vendedor (String nome, double vendas, double comissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendas() {
        return this.vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double obterSalario () { 
        return vendas * (comissao/100);
    }

}