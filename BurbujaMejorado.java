public class BurbujaMejorado extends Ordenamiento{

    public BurbujaMejorado(double[] elementos) {
        super(elementos);
    }

    @Override
    public void ordenar() {
        boolean ordenado = false;
        for (int i = 1; i < elementos.length && !ordenado; i++) {
            ordenado = true;
            for (int j = 0; j < elementos.length - i; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    ordenado = false;
                    double aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
            }
        }
    }
}
