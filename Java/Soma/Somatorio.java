public class Somatorio {
    public static int somatorio(int m, int n){
        if(n == m){
            return m;
        }
        else{
            return n + somatorio(m, n-1);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(somatorio(1, 10));
    }
}
