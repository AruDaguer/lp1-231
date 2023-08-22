package semana20;

public class SingleChoiceQuestion extends Question {

    private String correctOption;

     public SingleChoiceQuestion(int number, String statement, String correctOption) {
        super(number, statement);
        this.correctOption = correctOption;
    }

    public String getCorrectOption() {
        return correctOption;
    }

}
