public interface IPilha {
    
    //verifica se a pilha é vazia
    public boolean isEmpty();
    
    //insere um elemento na pilha
	public boolean push(int info);

    //remove(desempilha) um elemento da pilha
    public int pop();

    //retorna o topo da pilha
    public int top();

    //retorna o número de elementos na pilha
	public int size();

    //retorna o maior número armazenado na pilha, caso contrário, retorna -1
    public int maior();

    //retorna o menor número armazenado na pilha, caso contrário, retorna -1
    public int menor();

    //exibe todos elementos armazenados na pilha
    public String toString();
	
}
