public class Main {

    public static void main(String[] args) {
        IVetor v1 = new Vetor(5);
        
        v1.add(5);
        v1.add(4);
        v1.add(1);

        v1.sort(v1);

        System.out.println(v1.toString());

    }
}