import java.util.Random;
public class Arreglo{

/*Arreglo general Para cada algoritmo*/
public double[] elementos;

    public Arreglo(){}

    /*
    *   Método que regresa un arreglo de tamaño diezmil
     */
    public double[] generaDiezMil(){
        elementos= new double[10000];
        llenar();
        return elementos;
    }

    /*
     *   Método que regresa un arreglo de tamaño cincuenta mil
     */
    public double[] generaCincuentaMil(){
        elementos= new double[50000];
        llenar();
        return elementos;
    }
    /*
     *   Método que regresa un arreglo de tamaño
     */
    public double[] generaCienMil(){
        elementos= new double[100000];
        llenar();
        return elementos;
    }

    /*
     *   Método que regresa un arreglo de tamaño diez
     */
    public double[] generaCientoCincuentaMil(){
        elementos= new double[150000];
        llenar();
        return elementos;
    }

    /*
     *   Método que regresa un arreglo de tamaño diez
     */
    public double[] generaQuinientosMil(){
        elementos= new double[500000];
        llenar();
        return elementos;
    }

    /**
     * Metodo para generar elementos aleatorios(desordenados) en el rango de
     * 0-100 y llenar el arreglo con ellos
     */
    public void llenar() {
        Random r = new Random();
        for (int i = 0; i < elementos.length; i++) {
        elementos[i] = r.nextInt(100) ;

        }
    }



}