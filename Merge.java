public class Merge extends Ordenamiento{

    public Merge(double[] elementos) {
        super(elementos);
    }

    @Override
    public void ordenar() {
        mergesort(0,elementos.length);
    }

    /**
     * Método para ordenar los elementos de la clase por mezclas de sublistas
     * ordenadas
     * @param init - índice incial del subarreglo
     * @param n - cantidad de elementos que tiene un arreglo
     */
    private void mergesort(int init, int n) {
        int n1;
        int n2;
        if (n > 1) {//Ya tenemos un arreglo ordenado
            n1 = n / 2; //Buscamos el índice medio dentro del arreglo
            //System.out.println(n1 + " elemento medio: " + n1);
            n2 = n - n1;

            mergesort(init, n1);
            mergesort(init + n1, n2);
            merge(init, n1, n2);
        }
        //imprimir();
    }

    /**
     * Método para mezclar las dos arreglos generados
     */
    private void merge(int init, int n1, int n2) {
        double[] buffer = new double[n1 + n2];
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        int i;
        while ((temp1 < n1) && (temp2 < n2)) {
            if (elementos[init + temp1] < elementos[init + n1 + temp2]) {
                buffer[temp++] = elementos[init + (temp1++)];
            } else {
                buffer[temp++] = elementos[init + n1 + (temp2++)];
            }
        }
        while (temp1 < n1) {
            buffer[temp++] = elementos[init + (temp1++)];
        }
        while (temp2 < n2) {
            buffer[temp++] = elementos[init + n1 + (temp2++)];
        }
        for (i = 0; i < n1 + n2; i++) {
            elementos[init + i] = buffer[i];
        }
    }

}
