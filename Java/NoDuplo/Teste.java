public class Teste {
	
	
    public static void main(String[] args) {
		ListaDupla doubleList = new ListaDupla();

		doubleList.add(9);


		doubleList.add(4);
	
		
		doubleList.add(3);

		
		doubleList.add(2);

        
        doubleList.add(8);

        doubleList.selectionSort();

        System.out.println("Lista: "+doubleList.toString());

    }
}