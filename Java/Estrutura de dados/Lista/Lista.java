//implementação da lista simplesmente encadeada
public class Lista {
    private No inicio;

//construtor da classe
public Lista(int info){
    this.inicio = null;
}

//retorna se a lista é vazia
public boolean isEmpty(){
    return (inicio == null);
}

//insere no inicio da lista
public void insereInicio(int info){
    No novo = new No(info);

    if(inicio == null){
        inicio = novo;
    }
    else{
        novo.setProx(inicio);
        inicio = novo;
    }
}

//insere no final da lista
public void insereFim(int info){
    No novo = new No(info);

    if(inicio == null){
        inicio = novo;
    }
    else{
        No aux = inicio;
        while(aux.getProx() != null){
            aux = aux.getProx();
        }
        aux.setProx(novo);
    }
}

//remove do final da lista
public boolean removeFim(int info){

    No aux = inicio;

    if(inicio == null){
        return false;
    }
    else{
        while(aux != null){
            if(aux.getInfo == info){
                aux.setProx(null);
            }
            else{
                aux = aux.getProx();
            }
        }
    }
}

//remove do inicio da lista
public boolean removeInicio(){
    No aux = inicio;

    if(inicio == null){
        return false;
    }
    else{
        while(aux.getProx != null){
            aux = aux.getProx();
        }
    inicio = null;
    return true;
    }
}

//retorna o número de elementos armazenados na lista
public int size(){
    int count = 0;
    No aux = inicio;

    while(aux.getProx() != null){
        count++;
        aux = aux.getProx();
    }
    return count;
}

//busca por um elemento passado por parâmetro
public boolean buscar(int info){
    No aux = topo;
    
    while(aux != null){
        if(aux.getInfo() == info){
            return true;
        }
        aux = aux.getProx();
    }
    return false;
    }
}
