package semana22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarAluno {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost/lp1?user=root&password=1234&useSSL=true";
        Connection connection = DriverManager.getConnection(url);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Insira o email: ");
        String email = scanner.nextLine();
        System.out.println("Insira o estado: ");
        boolean ativo = scanner.nextBoolean();

        String sql = "UPDATE alunos SET nome = ?, email = ?, ativo = ? WHERE id = ?;";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setString(1, nome);
        pstm.setString(2, email);
        pstm.setBoolean(3, ativo);
        pstm.setInt(4, id);

        pstm.executeUpdate();

        pstm.close();
        connection.close();
    }
}
