public class No {
    private int info;
    private No prox;

public No (int num) {
    this.info = num;
    this.prox= null;
}

public int getInfo() {
    return this.info;
}

public No getProx() {
    return this.prox;
}

public void setProx(No n) {
    this.prox= n;
}
}