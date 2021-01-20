public class Teste {
    public static void main(String[] args) {
       Pilha p = new Pilha();
       
       p.push(8);
       p.push(10);
       p.push(7);

       p.pop();
       
       System.out.println(p.toString());       
    }
}
