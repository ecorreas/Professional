public class MainLista {
    
    public static void main(String[] args) {
        Lista l = new Lista();
        
        l.insereInicio(8);
        l.insereInicio(9);
        l.insereInicio(10);
 
        System.out.println(l.buscar(10));       
     }
}
