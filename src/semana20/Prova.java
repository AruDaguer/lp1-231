package semana20;
import java.util.ArrayList;
import java.util.List;

public class Prova {
    private List<Questao> questoes;

    public Prova() {
        questoes = new ArrayList<>();
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public int calcularPontuacaoTotal(List<String> respostasUsuario) {
        int pontuacaoTotal = 0;

        for (int i = 0; i < questoes.size(); i++) {
            Questao questao = questoes.get(i);
            String respostaUsuario = respostasUsuario.get(i);

            if (questao.verificarResposta(respostaUsuario)) {
                pontuacaoTotal += questao.getPontuacao();
            }
        }

        return pontuacaoTotal;
    }
}
