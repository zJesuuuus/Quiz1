import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        // Crear el scanner para leer datos ingresados
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero positivo: ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el primer número entero positivo: ");
        int num2 = input.nextInt();
        // CON ESTE IF SE VALIDARA QUE LOS 2 NUMEROS INGRESADOS POR EL USUARIO SEAN POSITIVOS
        if ((num1 >0) && (num2 > 0)) {
            // CON ESTE FOR SE HARA UN SUMADOR PARA DIVIDIR EL NUMERO INGRESADO POR CADA NUMERO DEL 1-100
            for (int i = 1; i < 100; i++){
                int sol1 = num1 % i;
                int sol2 = num2 % i;
                // CON ESTE IF SE VERIFICARA SI ES DIVISIBLE POR EL CONTADOR Y SE SUMARAN
                if (sol1 == 0) {
                    int almacenarAmigos1 = i;
                    System.out.println("Divisibles por el primer numero: " + almacenarAmigos1);
                    int sumador1 = (almacenarAmigos1 + almacenarAmigos1);
                    System.out.println("La suma de los numeros divisibles 1er num es: " + (sumador1));
                }
                // CON ESTE IF SE VERIFICARA SI ES DIVISIBLE POR EL CONTADOR Y SE SUMARAN
                if (sol2 == 0) {
                    int almacenarAmigos2 = i;
                    System.out.println("Divisibles por el segundo numero: " + almacenarAmigos2);
                    int sumador2 = (almacenarAmigos2);
                    System.out.println("La suma de los numeros divisibles 2do num es: " + sumador2);
                }
            }
        }
    }
}
