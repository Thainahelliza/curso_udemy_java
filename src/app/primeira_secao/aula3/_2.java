package app.primeira_secao.aula3;
import java.util.Scanner;
public class _2 {
        public static void main(String[] args)  {

            Scanner sc = new Scanner(System.in);

            String s1, s2, s3;

            //Para ler um texto ATÉ A QUEBRA DE LINHA
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            s3 = sc.nextLine();

            System.out.println("DADOS DIGITADOS:");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            sc.close();
        }
    }
