//implementação de uma lista duplamente encadeada com ponteiros para o inicio e fim.
public class ListaDupla {
    private No inicio;
    private No fim;

//construtor da classe
public ListaDupla(){
    this.inicio = null;
    this.fim = null;
}

//insere um novo elemento em seu inicio
public void insereInicio(int info){
    No novo = new No(info);

    if(inicio == null){
        inicio = novo;
        fim = novo;
    }
    else{
        novo.setProx(inicio);
        inicio.setAnt(novo);
        inicio = novo;
    }
}


public int get(int indice){
    No aux = inicio;
    int i = 0;
    
    if(inicio == null){
        System.out.println("Lista Vazia.");
    }
    else{
        for(int i; i == indice; i++){
            aux = aux.getProx();        
        }
    }
    return aux.getInfo();
}

public int indexOf(int info){
    No aux = inicio;
    int indice = 0;
    
    if(aux == null){
        System.out.println("Lista Vazia.");
    }
    else{
        while(aux.getProx() != null){
            if(aux.getInfo() == info){
                return indice;
            }
            indice++;
            aux = aux.getProx();
        }
        System.out.println("Não encontrado.");
    }
}

public boolean isEmpty(){
    return (inicio == fim);
}

// public boolean remove(int info){
//     No aux = inicio;

//     if(inicio.getInfo() == info){
//         if(inicio == fim){
//             inicio = null;
//             fim = null;
//         }
//     }
//     else{
//         while(aux != null){
//             if(aux.getInfo() == info){
//                 aux.setAnt();
//             }
//         }
//     }
// }

public int set(int indice, int info){

}

public int size(){

}


}
