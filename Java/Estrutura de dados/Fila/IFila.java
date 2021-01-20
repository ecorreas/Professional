public interface IFila {
    
	//retorna true se a fila está vazia ou false caso contrário
    public boolean isEmpty();
	
	//insere elemento no fim da fila
	public boolean add(int info);
	
	//remove o elemento do inicio da fila
    public boolean remove();
	
	//retorna o número de elementos
	public int size();
	
	//etorna uma String com todos os elementos
	public String toString();
	
	//retorna o menor número da fila, caso contrário, retorna -1
	public int menor();

	//insere um elemento no final da fila
	public boolean insereFinal(int info);

	//busca por um elemento passado por parametro
	public boolean buscarElemento(int info);
}
