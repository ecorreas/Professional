package Listas;

import sun.swing.PrintColorUIResource;

public class ListaLigada {
    private No inicio;
}

public ListaLigada(){
    this.inicio = null;
}

public boolean ehVazia(){
    if(this.inicio == null){
        return true;
    }
    else{
        return false;
    }
}

//C)
public void inserirNoInicio(Object info){
    No aux = new No(info, this.inicio);
    this.inicio = aux;
}

//D)
public void removeDoInicio() throws Exception {
    Object aux;
    if(this.inicio != null){
        aux = this.inicio.getInfo();
        this.inicio = this.inicio.getProx();
        return aux;
    }
    else{
        throw new Exception("Lista ligada vazia.");
    }
}

//E)
public void inserirNoFinal(Object info){
    No aux = this.inicio;
    if(!this.ehVazia()){
        while(aux.getProx != null){
            aux = aux.getProx();
            aux.setProx(new No(info, null));
        }
    else{
        this.inicio = new No(info, null);
        }
    }
}

//F)
public Object removeDoFim(){
    Object aux;
    
    if(!this.ehVazia()){
        if(this.inicio.getProx == null){
            aux = this.inicio.getInfo();
            this.inicio = null;
        }
        else{
            No aux2 = this.inicio;
            while(aux2.getProx().getProx() != null)
                aux2 = aux2.getProx();
                aux = aux2.getProx().getInfo();
                aux2.setProx(null);
        }
        return aux;
    }
    else{
        throw new Exception("Lista ligada vazia. Não é possível remover item.");
    }
}
 //G)
public void exibe(){
    No aux = this.inicio;

        while(aux != null){
            System.out.println(aux.getInfo()+" ");
            aux = aux.getProx();
        }
}

//H)
public void exibeDoFim(){
    No ant;
    No aux = this.inicio;

        if(!this.ehVazia()){
            while(aux != null){
                ant = aux;
                aux = aux.getProx();
                
            }
            while(ant != null){
                System.out.println(aux.getInfo()+" ");
                aux = ant;
            }
        }
        else{
            throw new Exception("Lista ligada vazia.");
        }
}