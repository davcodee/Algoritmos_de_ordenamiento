public class Seleccion  extends Ordenamiento{

    public Seleccion(double[] elementos) {
        super(elementos);
    }

    public void ordenar(){
        for (int i = 0; i < elementos.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < elementos.length; j++) {
                if (elementos[j] < elementos[minimo]) {
                    minimo = j;
                }
            }
            double aux = elementos[i];
            elementos[i] = elementos[minimo];
            elementos[minimo] = aux;
            //imprimir();
        }
    }

}
