package semana20;

public class Questao {
    private int numero;
    private String enunciado;
    private String respostaCorreta;

    public Questao(int numero, String enunciado, String respostaCorreta) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;
    }

    public int getNumero() {
        return numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public boolean verificarResposta(String respostaUsuario) {
        return respostaUsuario.equalsIgnoreCase(respostaCorreta);
    }

    public int getPontuacao() {
        return 1;
    }
}
