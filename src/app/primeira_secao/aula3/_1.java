package app.primeira_secao.aula3;

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
        {//variavel tipo char, charAt (0) = pega o primeiro caractere do string
            System.out.println("Insira um 4o valor");
            char d;
            d = sc.next().charAt(0);
            System.out.println(d);
        }
        {//ler varios dados na mesma linka
            System.out.println("Insira 3 valores");
            String a;
            int b;
            double c;
            a = sc.next();
            b = sc.nextInt();
            c = sc.nextDouble();
            System.out.println(a + b + c);
        }
        sc.close(); //encerra a entrada de dados
    }
}
