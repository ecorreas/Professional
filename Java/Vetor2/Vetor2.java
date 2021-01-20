public class Vetor2<T extends Comparable<T>> implements IVetor2<T>{
	
	private T[] vet;
	private int numElementos;
	
	public Vetor2(int max){
		vet = (T[])new Comparable[max];
		numElementos = 0;
	}
	
    public boolean add(T item){
		if(!isFull()){
			vet[numElementos] = item;
			numElementos++;
			return true;
		}
		return false;
	}
    
    public boolean contains(T item){
		for(int i=0; i<numElementos; i++){
			if(vet[i] == item)
				return true;
		}
		return false;
	}

    public T get(int indice){
		if(indice >= 0 && indice<numElementos)
			return vet[indice];
		return null;
	}

    public int indexOf(T item){
		for(int i=0; i< numElementos; i++){
			if(vet[i] == item)
				return i;
		}
		return -1;
	}

    public boolean isEmpty(){
		if(numElementos == 0) 
			return true;
		return false;
	}

    public boolean isFull(){
		if(numElementos == vet.length){
			return true;
		}
		return false;
	}
    
    public boolean remove(T item){
		int indice = indexOf(item);
		if(indice != -1){
			for(int i = indice; i<numElementos-1; i++){
				vet[i] = vet[i+1];
			}
			numElementos--;
			return true;
		}
		return false;
	}

    public boolean set(int indice, T novoItem){
		if(indice >=0 && indice < numElementos){
			vet[indice] = (T)novoItem;
			return true;
		}
		return false;
	}

    public int size(){
		return numElementos;
	}

    public String toString(){
		String s = "[ ";
		for(int i=0; i<numElementos; i++){
			s = s + vet[i] + " ";
		}
		s = s + "]";
		return s;
	}
 
    
	public void sort(){
		insertionSort();
	}
	
	public void insertionSort(){
		T aux;
		for(int i=1; i< numElementos; i++){
			for(int j=i; j>0; j--){
				if(vet[j].compareTo(vet[j -1]) < 0){
					aux = vet[j -1];
					vet[j -1] = vet[j];
					vet[j] = aux;
				}
				else
					break;
				
			}
			
		}
	}	
	
	public void bubbleSort(){
		T aux;
		for(int i=0; i< numElementos; i++){
			for(int j=0; j< numElementos -1; j++){
				if(vet[j].compareTo(vet[j+1]) >0 ){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}	
			}
		}
	}
	
	public void selectionSort(){
		int menor;
		T aux;
		for(int i=0; i< numElementos; i++){
			menor = i;
			for(int j=i+1; j< numElementos; j++){
				if(vet[menor].compareTo(vet[j]) > 0 )
					menor = j;
			}
			aux = vet[i];
			vet[i] = vet[menor];
			vet[menor] = aux;
		}
	}
}