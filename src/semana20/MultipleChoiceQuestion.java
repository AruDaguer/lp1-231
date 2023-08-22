package semana20;
import java.util.List;

public class MultipleChoiceQuestion extends Question {
    
    private List<String> correctOptions;

    public MultipleChoiceQuestion(int number, String statement, List<String> correctOptions) {
        super(number, statement);
        this.correctOptions = correctOptions;
    }

    public List<String> getCorrectOptions() {
        return correctOptions;
    }

}
