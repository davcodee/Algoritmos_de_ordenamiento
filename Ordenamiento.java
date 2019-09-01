

public abstract class Ordenamiento {

    protected double elementos [];

    public Ordenamiento(double[] elementos){

        this.elementos = elementos;
    }


    public abstract void ordenar();

    public void imprimir() {
        System.out.println("\nImprimiendo elementos...");
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + ",");
        }

    }


}
