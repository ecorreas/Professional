public class No {
    private int info;
    private No prox;

    public No(int num){
        this.info = num;
        this.prox = null;
    }

    public int getInfo(){
        return info;
    }

    public No getProx(){
        return prox;
    }

    public void setProx(No n){
        prox = n;
    }
}
