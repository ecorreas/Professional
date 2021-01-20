public class MDC {
    public static int MDC(int x, int y){
        if(x == y) return x;
        if(x < y) return MDC(y, x);
        return MDC(x - y, y);
    }

    public static void main(String args[]) {
        System.out.println(MDC(15, 10));
    }
}
