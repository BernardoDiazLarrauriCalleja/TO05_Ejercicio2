package paquete;

/**
 * @author Bernardo Díaz Larrauri Calleja
 * @version: 26/03/2021
 * @see
 * <a href = "https://github.com/BernardoDiazLarrauriCalleja/TO05_Ejecicio2.git"/>GitHub
 * TO05_Ejercicio2<a>
 *
 */

public class Operacion {

    private double x;
    private double y;
    private double resultado;

    /**
     * Contructor. El objeto Operación guarda dos valores decimales, que luego
     * sus métodos lo sumarán ,restarán y multiplicará y diividirán.
     *
     * @param x primer valor del objeto
     * @param y segundo valor del objeto
     */
    public Operacion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Método que suma los parémtros del objeto.
     *
     * @return suma de x + y
     */
    public double suma() {
        resultado = x + y;

        return resultado;
    }

    /**
     * Método que resta los parámetros del objeto.
     *
     * @return resta x -y
     */
    public double resta() {
        resultado = x - y;

        return resultado;
    }
    
    /**
     * Método que resta los parámetros del objeto.
     *
     * @return resta x -y
     */
    public double multiplicacion() {
        resultado = x * y;

        return resultado;
    }
    
    /**
     * Método que resta los parámetros del objeto.
     *
     * @return resta x -y
     */
    public double division() {
        resultado = x / y;

        return resultado;
    }
    
    /**
     * Método que resta los parámetros del objeto.
     *
     * @return resta x -y
     */
    public void setY(double y) {
        this.y = y;
    }
    
     /**
     * Método que resta los parámetros del objeto.
     *
     * @return resta x -y
     */
    public double getResultado() {
        return resultado;
    }
}
