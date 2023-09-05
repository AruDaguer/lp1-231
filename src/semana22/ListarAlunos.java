package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ListarAlunos {
    public static void main(String[] args) throws SQLException {
        // 1- Abrir a conexão

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conection =  DriverManager.getConnection(url);

        // 2- Executar a consulta e usar os resultados

        String sql = "SELECT * FROM aluno;";
        Statement statement = conection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()) {
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            String email = rs.getString("email");
            Boolean ativo = rs.getBoolean("ativo");

            System.out.println( id + ", " + nome + ", " + email + ", " + ativo);
        }
        

        // 3- Fechar conexão

        statement.close();
        conection.close();
    }
}
