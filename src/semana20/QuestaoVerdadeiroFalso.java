package semana20;

public class QuestaoVerdadeiroFalso extends Questao {
    public QuestaoVerdadeiroFalso(int numero, String enunciado, boolean respostaCorreta) {
        super(numero, enunciado, respostaCorreta ? "Verdadeiro" : "Falso");
    }
}
    
