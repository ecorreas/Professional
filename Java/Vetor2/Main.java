public class Main {
    public static void main(String[] args) {
        IVetor2 <Pessoa> vp1 = new Vetor2(5);
		
		Pessoa p1 = new Pessoa("Evandro", 22);
		Pessoa p2 = new Pessoa("Evandro", 22);
        
        vp1.add(p1);
        vp1.add(p2);
        vp1.add(new Pessoa("Isadora", 20));

        System.out.println("vp1 = " + vp1.toString());
        
		vp1.add(new Pessoa("Roberta", 27));
        vp1.add(new Pessoa("Larissa", 31));
        
        System.out.println("vp1 = " + vp1.toString());
        
        vp1.sort();

        System.out.println("vp1 = " + vp1.toString());
    }
}
