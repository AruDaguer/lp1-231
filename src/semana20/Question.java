package semana20;

public class Question {
    
    public int number;
    public String statement;

    public Question(int number, String statement) {
        this.number = number;
        this.statement = statement;
    }

    public int getNumber() {
        return number;
    }

    public String getStatement() {
        return statement;
    }

    public int getScore() {
        return 1;
    }

}
