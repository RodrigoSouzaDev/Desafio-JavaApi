public class Main {
    public static void main(String[] args) {
        int [] vetor = {5,3,2,4,7,1,0,6};

        BubbleSort.sort(vetor);

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
