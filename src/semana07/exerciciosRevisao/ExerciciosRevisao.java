package semana07.exerciciosRevisao;

public class ExerciciosRevisao {
    
    public static double somarTresValores( double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }

    public static double calcularMediaAritmetica ( double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static int acharMaiorValor ( int n1, int n2, int n3) {
        int[] nums = {n1, n2, n3};
        int maiorNum = nums[0];
        for (int i = 1; i < 3; i++) {
            if (nums[i] > maiorNum) {
                maiorNum = nums[i];
            }
        }
        return maiorNum;
    }

    public static int acharMenorValor ( int n1, int n2, int n3) {
        int[] nums = {n1, n2, n3};
        int menorNum = nums[0];
        for (int i = 1; i < 3; i++) {
            if (nums[i] < menorNum) {
                menorNum = nums[i];
            }
        }
        return menorNum;
    }

    public static double[] criarArrayTresValores (double n1, double n2, double n3) {
        double[] arrayTresValores = {n1, n2, n3};
        return arrayTresValores;
    }

    public static double somarArray (double[] array) {
        double soma = 0;
        for (double num : array) {
            soma =+ num;
        }
        return soma;
    }

    public static double acharMediaAritmeticaArray (double[] array) {
        double soma = 0;
        double media = 0;
        for (double num : array) {
            soma =+ num;
        }
        media = soma / array.length;
        return media;
    }

    public static double acharMaiorValorArray (double[] array) {
        double maiorValor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
            }
        }
       return maiorValor; 
    }

    public static double acharMenorValorArray (double[] array) {
        double menorValor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menorValor) {
                menorValor = array[i];
            }
        }
       return menorValor; 
    }

    public static int[] juntarDoisArrays (int[] array1, int[] array2) {
        int[] elementos = new int  [(array1.length + array2.length)];
        int i = 0;

        for (int numero : array1) {
            elementos[i] = numero;
            i++;
        }

        for (int numero : array2) {
            elementos[i] = numero;
            i++;
        }
        return elementos; 
    }

}
