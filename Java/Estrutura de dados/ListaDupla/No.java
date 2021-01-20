public class No {
    private int info;
    private No ant;
    private No prox;

public No(int num){
    this.info = num;
    this.ant = null;
    this.prox = null;
}

public int getInfo(){
    return this.info;
}

public No getAnt(){
    return this.ant;
}

public void setAnt(No n){
    this.ant = n;
}

public No getProx(){
    return this.prox;
}

public void setProx(No n){
    this.prox = n;
}
}
