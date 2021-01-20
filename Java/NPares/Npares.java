public class Npares {
    
    public static int npares(int[] vet, int n){
        if(n == 0){
            return 0;
        }
        if(vet[n-1]%2 == 0){
            return 1 + npares(vet, n-1);
        }
        else{
            return npares(vet, n-1);
        }
    }
}
