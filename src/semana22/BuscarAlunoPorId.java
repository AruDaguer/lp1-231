package semana22;

import java.sql.*;
import java.util.Scanner;

public class BuscarAlunoPorId {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o id: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM alunos WHERE id = ?;";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setInt(1, id);

        ResultSet rs = pstm.executeQuery();
        rs.next();

        System.out.println("ID | NOME | EMAIL | ATIVO");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        boolean ativo = rs.getBoolean("ativo");
        System.out.println(id + " | " + nome + " | " + email + " | " + ativo );

        pstm.close();
        connection.close();

    }
}
