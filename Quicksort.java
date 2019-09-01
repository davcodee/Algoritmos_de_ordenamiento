public class Quicksort extends Ordenamiento {

    public Quicksort(double[] elementos) {
        super(elementos);
    }

    private void quickSort(int left, int right) {

        //Índice en donde se encuentra el pivote.
        int index = partition(left, right);

        if (left < index - 1) {
            quickSort(left, index - 1);
        }
        if (index < right) {
            quickSort(index, right);
        }
        //imprimir();
    }

    private int partition(int left, int right) {
        int i = left, j = right;
        double tmp;
        double pivot = elementos[(left + right) / 2];
        while (i <= j) {
            while (elementos[i] < pivot) {
                i++;
            }
            while (elementos[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = elementos[i];
                elementos[i] = elementos[j];
                elementos[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    @Override
    public void ordenar() {
        quickSort(0,elementos.length-1);
    }
}
