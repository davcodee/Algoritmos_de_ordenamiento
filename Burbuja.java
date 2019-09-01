public class Burbuja extends Ordenamiento {

    public Burbuja(double[] elementos) {
        super(elementos);
    }
    @Override
    public void ordenar( ) {
        for (int i = 1; i < elementos.length; i++)
            for (int j = 0; j < elementos.length - i; j++){
                if (elementos[j] > elementos[j + 1]) {
                    double aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
                //imprimir();
            }
    }

}
