public class Teste {
    public static void main(String[] args) {
       Fila f = new Fila();
       
       for (int i = 1; i <= 5; i++){
          f.add(i);
		  System.out.println(f.toString());
	   }

       do {
           f.remove();
           System.out.println(f.toString());
       } while (!f.isEmpty());       
    }
}
