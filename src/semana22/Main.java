package semana22;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC - Java Database Conection
// Conjunto de interface e classe para acesso as SGDBs
// Java App --> JDBC --> Driver ( Biblioteca que implementa JDBC ) --> SGBD
// App Desktop          --> Driver MySQL -->                           MySQL

public class Main {
    public static void main(String[] args) throws SQLException{
        // 1- Abrir a conexão

        String url = "jdbc:mysql://localhost/estudante?user=estudante&password=estudante&useSSL=true";
        Connection conection =  DriverManager.getConnection(url);

        // 2- Executar a consulta e usar os resultados

        String sql = "CREATE TABLE aluno(id INT PRIMARY KEY, nome VARCHAR(100), email VARCHAR (255), ativo BOOL);";
        Statement statement = conection.createStatement();
        statement.execute(sql);

        // 3- Fechar conexão

        statement.close();
        conection.close();

    }

}