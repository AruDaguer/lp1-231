package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InserirAluno {
    public static void main(String[] args) throws SQLException {
        // 1- Abrir a conexão

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conection =  DriverManager.getConnection(url);

        int id = 2;
        String nome = "pedro joao";
        String email = "pedrooo@email.com";
        Boolean ativo = true;
 
        // 2- Executar a consulta e usar os resultados

        String sql = "INSERT INTO aluno VALUES( ?, ?, ?, ? );";
        PreparedStatement statement = conection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, nome);
        statement.setString(3, email);
        statement.setBoolean(4, ativo);

        statement.executeUpdate();

        // 3- Fechar conexão
 
        statement.close();
        conection.close();
    }
    
}
