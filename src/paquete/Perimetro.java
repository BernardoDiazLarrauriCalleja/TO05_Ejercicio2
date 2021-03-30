package paquete;

/**
 * @author Bernardo Díaz Larrauri Calleja
 * @version: 26/03/2021
 * @see
 * <a href = "https://github.com/BernardoDiazLarrauriCalleja/TO05_Ejecicio2.git"/>GitHub
 * TO05_Ejercicio2<a>*
 */
public class Perimetro {

    private double lado1;
    private double lado2;
    private double lado3;
    private double radio;
    private double perimetro;
    private final double PI = Math.PI;

    public Perimetro(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Perimetro(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Perimetro(double radio) {
        this.radio = radio;
    }

    public double areaCuadrado() {
        perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }

    public double areaTriangulo() {
        perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public double areaCirculo() {
        perimetro = 2 * PI * radio;
        return perimetro;
    }
}
