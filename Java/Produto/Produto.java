public class Produto {
    
    //INCOMPLETO
    public static int[] produto(int n){
        if(n == 0) return 0;
        return vet[n-1]*produto(n-1);
    }
}