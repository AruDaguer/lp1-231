package semana20;
import java.util.ArrayList;
import java.util.List;

public enum Answers {

    public List<Question> questions;
    
    Answers(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getAnswers() {
        return questions;
    }

    private static List<Question> getQuestions(){
        List<Question> questions = new ArrayList<>();
        MultipleChoiceQuestion questao1 =  new MultipleChoiceQuestion(0, null, null);
    }

    
}
