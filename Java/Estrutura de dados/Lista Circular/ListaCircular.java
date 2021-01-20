//implementação de uma lista circular, com ponteiro para o inicio
public class ListaCircular {
    private No inicio;

//construtor da nossa classe
public ListaCircular(){
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
        novo.setProx(novo);
        inicio = novo;
    }
    else{
        novo.setProx(inicio);
        No aux = inicio;
        while(aux.getProx() != inicio){
            aux = aux.getProx();
        }
        aux.setProx(novo);
        inicio = novo;
    }
}

//insere no fim da lista
public void insereFim(int info){
    No novo = new No(info);

    if(inicio == null){
        novo.setProx(novo);
        inicio = novo;
    }
    else{
        No aux = inicio;
        while(aux.getProx() != inicio){
            aux = aux.getProx();
        }
        aux.setProx(novo);
        novo.setProx(inicio);
    }
}

//remove do inicio da lista
public boolean remove(){
    
    if(inicio == null){
        return false;
    }else{
        No aux2 = inicio;
        while(inicio.getProx() != inicio){
            aux2 = inicio.getProx();
            inicio = inicio.getProx();
        }
        inicio = null;
        aux2.setProx(inicio);
    }            
    return true;
}

//retorna o numero de elementos na lista
public int numElementos(){
    int count = 0;
    No aux = inicio;

    if(aux == null){
        return count;
    }

    while(aux.getProx() != inicio){
        count++;
        aux = aux.getProx();
    }
    return count+1;
}

//exibe todos os elementos da lista
public String toString(){
    String info = "[";
    
    if(inicio != null){
        No atual = inicio;
        do{
            info += atual.getInfo();
            info += " ";
            atual = atual.getProx();
        }while(atual != inicio);
    }
    info += "]";
    return info;
}
}