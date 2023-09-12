package semana22;

import java.sql.*;
import java.util.Scanner;

public class BuscarAlunoPorNome {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();

        String sql = "SELECT * FROM alunos WHERE nome = ?;";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, nome);

        ResultSet rs = pstm.executeQuery();

        System.out.println("ID | NOME | EMAIL | ATIVO");
        while (rs.next()) {
            int id = rs.getInt("id");
            nome = rs.getString("nome");
            String email = rs.getString("email");
            boolean ativo = rs.getBoolean("ativo");
            System.out.println(id + " | " + nome + " | " + email + " | " + ativo);
        }

        pstm.close();
        connection.close();
    }

}
