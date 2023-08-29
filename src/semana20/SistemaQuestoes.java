package semana20;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaQuestoes {
    public static void main(String[] args) {
    
        Prova prova = new Prova();

        prova.adicionarQuestao(new QuestaoVerdadeiroFalso(1, "Java é uma linguagem de programação(Verdadeiro ou Falso).", true));
        prova.adicionarQuestao(new QuestaoUnicaEscolha(2, "Qual é o maior planeta do sistema solar? Terra, Júpiter ou Saturno (Única escolha)", "Júpiter"));

        List<String> opcoesMultiplaEscolha = new ArrayList<>();
        opcoesMultiplaEscolha.add("Azul");
        opcoesMultiplaEscolha.add("Verde");
        prova.adicionarQuestao(new QuestaoMultiplaEscolha(3, "Selecione as cores da bandeira do Brasil: Azul, Laranja, Marrom, Verde (separadas por vírgula).", opcoesMultiplaEscolha));

        Scanner scanner = new Scanner(System.in);
        List<String> respostasUsuario = new ArrayList<>();

        for (Questao questao : prova.getQuestoes()) {
            System.out.println(questao.getEnunciado());
            String respostaUsuario = scanner.nextLine();
            respostasUsuario.add(respostaUsuario);
        }

        int pontuacaoTotal = prova.calcularPontuacaoTotal(respostasUsuario);
        System.out.println("Pontuação total da prova: " + pontuacaoTotal);
    }
}