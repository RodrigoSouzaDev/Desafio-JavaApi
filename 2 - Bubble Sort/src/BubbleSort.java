public class BubbleSort {

    public static void sort(int [] vetor){

        int contador;

        do {
            contador = 0;
            for (int i = 0; i < vetor.length - 1; i++) {
                int j = i + 1;
                if (vetor[j] < vetor[i]) {
                    contador++;
                    int aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        } while (contador != 0);
    }
}