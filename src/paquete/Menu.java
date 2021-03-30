package paquete;

/**
 * @author Bernardo Díaz Larrauri Calleja
 * @version: 30/03/2021
 * @see
 * <a href = "https://github.com/BernardoDiazLarrauriCalleja/TO05_Ejecicio2.git"/>GitHub
 * TO05_Ejercicio2<a>
 */
public class Menu {

    public static void main(String[] args) {
        int numeroOpcion;

        System.out.println("--------------------------------------------------");
        System.out.println("\t\tMENU OPERACIONES\t\t");
        System.out.println("--------------------------------------------------");
        System.out.println("Opción 1 = Operaciones Matemáticas.");
        System.out.println("Opción 2 = Cáculo de Áreas.");
        System.out.println("Opción 3 = Cáculo de Perímetros.");
        System.out.println("--------------------------------------------------\n");

        numeroOpcion = ES.leeEntero(" Selecciona Opción: ", 1, 3);

        switch (numeroOpcion) {

            case 1:
                double x;
                double y;

                System.out.println("--------------------------------------------------");
                System.out.println("             Operaciones Matemáticas              ");
                System.out.println("--------------------------------------------------");
                System.out.println("Opción 1 = Suma.");
                System.out.println("Opción 2 = Resta.");
                System.out.println("Opción 3 = Multiplicación");
                System.out.println("Opción 4 = División");
                System.out.println("--------------------------------------------------\n");

                numeroOpcion = ES.leeEntero(" Selecciona Opción: ", 1, 4);
                System.out.println("--------------------------------------------------");
                x = ES.leeDecimal("\tIntroduce el valor de x: ");
                System.out.println("--------------------------------------------------");
                y = ES.leeDecimal("\tIntroduce el valor de y: ");

                Operacion nueva = new Operacion(x, y);
                
                System.out.println("--------------------------------------------------");
                if (numeroOpcion == 1) {
                    System.out.println("\t" +x + " + " + y + " = " + nueva.suma());
                }

                if (numeroOpcion == 2) {
                    System.out.println("\t" +x + " - " + y + " = " + nueva.resta());
                }

                if (numeroOpcion == 3) {
                    System.out.println("\t" +x + " x " + y + " = " + nueva.multiplicacion());
                }
                if (numeroOpcion == 4) {
                    while (y == 0) {
                        System.out.println("No se puede dividir un numero por 0.");
                        y = ES.leeDecimal(" Introduce el valor de y: ");
                        nueva.setY(y);
                    }
                    System.out.println("\t" +x + " / " + y + " = " + nueva.division());

                System.out.println("--------------------------------------------------\n");
                }
            break;
        }

    }

}
