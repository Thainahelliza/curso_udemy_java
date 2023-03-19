package app.aula2;

public class calculo {
    public static void main(String[] args) {
        { //calculo 1
            int x;
            double y;
            x = 5;
            y = 2 * x;
            System.out.println(x);
            System.out.println(y);
        }
        System.out.println();
        {// calculo 2
            double b, B, h, area;
            b = 6.0;
            B = 8.0;
            h = 5.0;
            area = (b + B) / 2.0 * h;
            System.out.println(area);
        }
        System.out.println();
        {//mesmo caso do 2o calculo porem usando float
            float b, B, h, area;
            b = 6f;
            B = 8f;
            h = 5f;
            area = (b + B) / 2f * h;
            System.out.println(area);
        }
        System.out.println();
        {//Calculo 3
            int a, b;
            double resultado;
            a = 5;
            b = 2;
            resultado = (double) a / b;
            System.out.println(resultado);
        }
        System.out.println();
        {//Casting = conversão de tipos
            double a;
            int b;
            a = 5.0;
            b = (int) a;
            System.out.println(b);
        }
    }
}
