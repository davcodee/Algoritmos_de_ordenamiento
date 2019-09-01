public class Insercion extends Ordenamiento{

    public Insercion(double[] elementos) {
        super(elementos);
    }

    @Override
    public void ordenar() {
        double aux;
        for (int i = 1; i < elementos.length; i++) {
            aux = elementos[i];
            for (int j = i - 1; j >= 0 && elementos[j] > aux; j--) {
                //System.out.println(j);
                elementos[j + 1] = elementos[j];
                elementos[j] = aux;
                //imprimir();
            }
        }

    }
}
