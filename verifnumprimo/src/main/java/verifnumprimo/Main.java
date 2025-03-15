
// verificador de números primos
package verifnumprimo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num, i;
        int contador = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para verificar se ele é primo: ");
        num = input.nextInt();
        input.close();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador += 1;
            }
        }

        if (contador == 2){
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        
    }
}