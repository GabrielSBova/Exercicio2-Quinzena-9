package Exercicio2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Geometria geo = new Geometria();
        Scanner leitor = new Scanner(System.in);
        String resp;
        System.out.println("-=-=-=-=-=-=-=-=-=- Cálculo de área de figuras geométricas -=-=-=-=-=-=-=-=-=-");
        System.out.println("Escolha o tipo" +
                "\n[ T ] Triângulo" +
                "\n[ Q ] Quadrado" +
                "\n[ C ] Círculo");
        resp = leitor.next();
        if (!resp.equals("T") && !resp.equals("Q") & !resp.equals("C")){
            do{
                System.out.println("Parâmetro incorreto. Digite T, Q ou C (Maiúsculas): ");
                resp = leitor.next();
            }while (!resp.equals("T") && !resp.equals("Q") & !resp.equals("C"));
        }
        if (resp.equals("T")){
            System.out.println("Digite o valor da base: ");
            geo.base = leitor.nextFloat();
            System.out.println("Digite o valor da altura: ");
            geo.altura = leitor.nextFloat();
            geo.calcularArea(geo.base, geo.altura);
        }
        else if (resp.equals("Q")){
            System.out.println("Digite o valor do lado 1:");
            geo.lado1 = leitor.nextDouble();
            System.out.println("Digite o valor do lado 2:");
            geo.lado2 = leitor.nextDouble();
            if (geo.lado1 != geo.lado2){
                System.out.println("Essa figura não é um quadrado!");
            }
            else{
                geo.calcularArea(geo.lado1, geo.lado2);
            }
        }
        else {
            System.out.println("Digite o valor do raio: ");
            geo.raio = leitor.nextInt();
            geo.calcularArea(geo.raio);
        }

    }
}
