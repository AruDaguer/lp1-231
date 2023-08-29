package semana20;
import java.util.ArrayList;
import java.util.List;

public class QuestaoMultiplaEscolha extends Questao {
    private List<String> opcoesCorretas;

    public QuestaoMultiplaEscolha(int numero, String enunciado, List<String> opcoesCorretas) {
        super(numero, enunciado, "");
        this.opcoesCorretas = opcoesCorretas;
    }

    @Override
    public boolean verificarResposta(String respostaUsuario) {
        List<String> respostaUsuarioList = new ArrayList<>(List.of(respostaUsuario.split("\\s*,\\s*")));
        return respostaUsuarioList.containsAll(opcoesCorretas) && opcoesCorretas.containsAll(respostaUsuarioList);
    }
}

