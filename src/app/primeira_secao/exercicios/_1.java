package app.primeira_secao.exercicios;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.
        //Exemplos:
        //Entrada:
        //10
        //30
        //Saída:
        //SOMA = 40


        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
