package Listas;

public class No {
    private Object info;
    private No prox;
}

public No(){
    this.info = null;
    this.prox = null;
}

public No(Object info, No prox){
    this.info = info;
    this.prox = prox;
}

public void setInfo(Object info){
    return this.info = info;
}

public int getInfo(){
    return this.prox;
}


