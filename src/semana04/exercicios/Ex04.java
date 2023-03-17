package semana04.exercicios;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o código: ");
        var codigo = sc.nextLine();

        // BR0102X 

        if (codigo.matches("BR\\d{4}X")){
            System.out.println("valido");
        } else {
            System.out.println("invalido");
        }

       /*  for (int i = 2; i < 6; i++) {
            if (codigo.toCharArray()[i] == 
        }
        if (codigo.length() != 7){
            if (codigo.toCharArray()[0] != 'B' && codigo.toCharArray()[1] == 'R'){
                if (codigo.toCharArray()[6] == 'X'){
                    System.out.println("valido");
                    return;
                }
            } 
        }
        System.out.println("invalido");
        return;
        */
    }
    
}
