

public class PruebaGeneral{
    public static void main(String [] args){
        Arreglo arreglo = new Arreglo();
        double[] array = arreglo.generaQuinientosMil();

        Burbuja burbuja =  new Burbuja(array);
        BurbujaMejorado burbujaMejorado = new BurbujaMejorado(array);
        Insercion insercion = new Insercion(array);
        Merge merge =new Merge(array);
        Quicksort quickSort = new Quicksort(array);
        Seleccion seleccion = new Seleccion(array);

        //Tiempo de burbuja
        long inicio = System.currentTimeMillis();
        burbuja.ordenar();
        long fin = System.currentTimeMillis();
        double tiempo = (double) (fin - inicio);
        System.out.println("Tiempo de burbuja: " + tiempo + " Milisegundos");


        //Tiempo de burbuja Mejorado
        long inicio2 = System.currentTimeMillis();
        burbujaMejorado.ordenar();
        long fin2 = System.currentTimeMillis();
        double tiempo2 = (double) (fin2 - inicio2);
        System.out.println("Tiempo de burbuja mejorado: " + tiempo2 + " Milisegundos");

        //Tiempo de  Insercion
        long inicio3 = System.currentTimeMillis();
        insercion.ordenar();
        long fin3 = System.currentTimeMillis();
        double tiempo3 = (double) (fin3 - inicio3);
        System.out.println("Tiempo de inserccion: " + tiempo3 + " Milisegundos");

        //Tiempo de  Insercion
        long inicio4 = System.currentTimeMillis();
        merge.ordenar();
        long fin4 = System.currentTimeMillis();
        double tiempo4 = (double) (fin4 - inicio4);
        System.out.println("Tiempo de merge: " + tiempo4 + " Milisegundos");

        //Tiempo de  Quicksort
        long inicio5 = System.currentTimeMillis();
        merge.ordenar();
        long fin5 = System.currentTimeMillis();
        double tiempo5 = (double) (fin5 - inicio5);
        System.out.println("Tiempo de Quicsort: " + tiempo5 + " Milisegundos");


        //Tiempo de Seleccion
        long inicio6 = System.currentTimeMillis();
        seleccion.ordenar();
        long fin6 = System.currentTimeMillis();
        double tiempo6 = (double) (fin6 - inicio6);
        System.out.println("Tiempo de selecion: " + tiempo6 + " Milisegundos");



    }
}