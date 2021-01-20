public class Quadrado {    
    public static int[] quadrados(int n){
        int vetor[] = new int[n];
        
        for(int i = 0; i < n; i++){
            vetor[i] = i * i;
        }
        return vetor;
    }
    public static void main(String args[]) {
        System.out.println(quadrados(6));
    }
}
