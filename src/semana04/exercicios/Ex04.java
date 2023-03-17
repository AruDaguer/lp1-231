package semana04.exercicios;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o código: ");
        var codigo = sc.nextLine();

        if (codigo.length() == 7){
            if (codigo[0] == 'B' && codigo[1] == 'R'){
                if (codigo[6] == 'X'){
                    System.out.println("valido");
                    return 0;
                }
            } 
        }
        System.out.println("invalido");
        return 0;
    }
    
}
