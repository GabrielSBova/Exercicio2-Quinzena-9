package Exercicio2;

public class Geometria{
    String formGeo;
    float base, altura; //Triângulo
    double lado1, lado2; //Quadrado
    int raio; //Circunferência


    public void calcularArea(float base, float altura){
        formGeo = "Triângulo";
        System.out.println("Forma geométrica: " + formGeo);
        System.out.println("Área do triângulo: " + (base*altura)/2);
    }

    public void calcularArea(double lado1, double lado2){
        formGeo = "Quadrado";
        System.out.println("Forma geométrica: " + formGeo);
        System.out.println("Área do quadrado: " + lado1*lado2);
    }

    public void calcularArea(int raio){
        formGeo = "Círculo";
        System.out.println("Forma geométrica: " + formGeo);
        System.out.println("Área do círculo: " + ((raio*raio) * 3.14));

    }
}
