package semana20;

public class TrueFalseQuestion extends Question {

    private boolean answer;

    public TrueFalseQuestion(int number, String statement, boolean answer) {
        super(number, statement);
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }
}
    
