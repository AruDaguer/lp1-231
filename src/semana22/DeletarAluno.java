package semana22;

import java.sql.*;
import java.util.Scanner;

public class DeletarAluno {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o id: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM alunos WHERE id = ?;";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.executeUpdate();

        pstm.close();
        connection.close();

    }
}
