package app.aula3;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        //aula sobre scaner, entrada de dados via teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor");
        String x;
        x = sc.next();
        System.out.println(x);

        {//lendo um numero inteiro
            System.out.println("Insira um 2o valor");
            int y;
            y = sc.nextInt();
            System.out.println(y);
        }
        {//ler um numero com pontuação
            System.out.println("Insira um 3o valor com casa decimal");
            double z;
            z = sc.nextDouble();
            System.out.println(z);
        }
        sc.close(); //encerra a entrada de dados
    }
}
