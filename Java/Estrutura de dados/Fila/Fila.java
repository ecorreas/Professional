//Implementação da classe fila, lembrando que teremos dois ponteiros, um para inicio e outro para o final
public class Fila {
    private No inicio;
    private No fim;

//construtor da fila
public Fila(){
    this.inicio = null;
    this.fim = null;
}

//verifica se minha fila está vazia, ou seja, inicio e fim apontando para null
public boolean isEmpty(){
    return (inicio == null);
}

//adiciona um novo elemento na fila
public boolean add(int info){
    No novo = new No(info);

    if(isEmpty()){
        inicio = novo;
    }
    else{
        fim.setProx(novo);
    }
    fim = novo;
    return true;
}

//remove um elemento do inicio da fila
public boolean remove(){
    
    if(inicio != null){
        if(inicio == fim){
            inicio = null;
            fim = null;
        }
        else{
            inicio = inicio.getProx();
        }
        return true;
    }
    return false;
}

//retorna o numero de elementos na fila
public int size(){
    int cont = 0;
    No aux = inicio;
    
    while(aux != null){
        cont++;
        aux = aux.getProx();
    }
    return cont;
}

//exibe todos os elementos da fila
public String toString(){
    String impInfo = "";
    No aux = inicio;

    while(aux != null){
        impInfo += aux.getInfo();
        aux = aux.getProx();
    }
    return impInfo;
}

//retorna o menor número da fila, caso contrário, retorna -1
public int menor(){
    int menor = -1;
    No aux = inicio;

    if(aux == null){
        return menor;
    }
    else{
        menor = aux.getInfo();
        while(aux != null){
            if(menor > aux.getInfo()){
                menor = aux.getInfo();
            }
            aux = aux.getProx();
        }
        return menor;
    }
}

//insere um elemento no final da fila
public boolean insereFinal(int info){

    No novo = new No(info);

    if(inicio == null){
        inicio = novo;
    }
    else{
        fim.setProx(novo);
    }
    fim = novo;
    return true;
}

//busca por um elemento passado por parametro
public boolean buscarElemento(int info){
    No aux = inicio;

    if(aux == null){
        System.out.println("Fila vazia.");
    }
    else{
        while(aux != null){
            if(aux.getInfo() == info){
                return true;
            }
            else{
                aux = aux.getProx();
            }
        }
        return false;
    }
}
}
