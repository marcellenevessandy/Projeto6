//jeito adequado 
package javaapplication38;

import java.util.Scanner;

public class JavaApplication38 {

    public static void main(String[] args) {

        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um núemro inteiro: ");
        num = ler.nextInt();

        if (num > 0) {
            System.out.println("Positivo!");
        } else if (num < 0) {
            System.out.println("Negativo!");
        }
        if (num == 0) {
            System.out.println("Nulo!");
        }
    }

}
