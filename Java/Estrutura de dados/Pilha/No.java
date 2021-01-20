public class No {
    private int info;
    private No prox;
    
    public No () {
        this.info = null;
        this.prox = null;
    }
    
   public No (int info) {
        this.info = info;
        this.prox = null;
    }
 
	public No (int info, No prox) {
        this.info = info;
        this.prox = prox;
    }

    public void setInfo (int info) {
        this.info = info;
    }

    public int getInfo () {
        return this.info;
    }
    
    public void setProx (No prox) {
        this.prox = prox;
    }

    public No getProx () {
        return this.prox;
    }
}
