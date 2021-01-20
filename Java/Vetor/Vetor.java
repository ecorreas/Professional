public class Vetor implements IVetor{
	
	private int[] vetor;
	private int numElementos;
	
	public Vetor(int max){
		vetor = new int[max];
		numElementos = 0;
	}
    
    public boolean add(int item){
        if(!isFull()){
            vetor[numElementos] = item;
            numElementos++;
            return true;
        }
        return false;
    }

    public boolean contains(int item){
        for(int i = 0; i < numElementos; i++){
            if(vetor[i] == item){
                return true;
            }
        }
        return false;
    }

    public int get(int indice){
        if(indice >= 0 && indice<numElementos){
            return vetor[indice];
        }
        else{
            return -1;
        }
    }

    //PESQUISA LINEAR
    public int indexOf(int item){
        for(int i = 0; i < numElementos; i++){
            if(vetor[i] == item){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        if(numElementos == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(numElementos != vetor.length){
            return false;
        }
        return true;
    }

    public boolean remove(int item){
        int indice = indexOf(item);

        if(indice != -1){
            for(int i = indice; i < numElementos-1; i++){
                vetor[i] = vetor[i+1];
            }
            numElementos--;
            return true;
        }
        return false;
    }

    public boolean set(int indice, int novoItem){
        if(indice >= 0 && indice < numElementos){
            vetor[indice] = novoItem;
            return true;
        }
        return false;
    }
    public int size(){
        return numElementos;
    }

    public String toString(){

        String vetorString = "[";

        for(int i = 0; i < numElementos; i++){
            vetorString += vetor[i] + " ";
        }
        vetorString += "]";
        return vetorString;
    }

    //public String exibeInv()

    //PESQUISA BINÁRIA
    public int indexOf(int item){
        int m, e = 0;
        int d = numElementos-1;

        while(e <= d){
            m = (e+d)/2;
            if(this.vetor[m] == item){
                return m;
            }
            else if(this.vetor[m] < item){
                e = m+1;
            }
            else{
                d = m-1;
            }
        }
        return -1;
    }

    //PESQUISA BINÁRIA COM RECURSÃO
    public int indexOf(int item, int e, int d){
        int m;
        if(e <= d){
            m = (e+d)/2;
            if(this.vetor[m] == item){
                return m;
            }
            else if(this.vetor[m] < item){
                return indexOf(item, m+1, d);
            }
            else{
                return indexOf(item, e, m-1);
            }
        }
        else{
            return -1;
        }
    }


    public int[] sort(int[] vet){
        int aux = 0;
        for(int i = 0; i < vet.length; i++){
            for(int j = 0; j < vet.length-1; j++){
                if(vet[j] > vet[j+1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        return vet;
    }
}
