package app.aula1;

import java.util.Locale;

public class aula1 {
    public static void main(String[] args) {
        //parte inicial
        int y = 32;
        double x = 10.35784;
        {
            System.out.printf("%.2f%n", x); //%2f limita a duas casas decimais, %n adiciona a quebra de linha
            System.out.println(y); //retorna o valor
            System.out.print("sem quebra de linha");
            System.out.println("com quebra de linha");

            Locale.setDefault(Locale.US);//define o padrão de linguagem de qual pais
            System.out.println(x);
        }
        //Concatenação
        {
            System.out.println("RESULTADO = " + x + " METROS");
            System.out.printf("RESULTADO = %.2f metros%n", x);
        }
        //%f = ponto flutuante, %d = inteiro, %s = texto, %m = quebra de linha
        {
            String nome = "Thaina";
            int idade = 31;
            double renda = 6000.0;

            System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        }
    }
}
