public class NoDuplo{
	private int info;
	private NoDuplo prox;
	private NoDuplo ant;
	
	public NoDuplo(int info){
		this.info = info;
		ant = null;
		prox = null;
	}

	public void setProx(NoDuplo n){
		prox = n;
	}

	public void setAnt(NoDuplo n){
		ant = n;
	}

	public void setInfo(int i) {
		info = i;
	}

	public NoDuplo getProx() {
		return prox;
	}

	public NoDuplo getAnt(){
		return ant;
	}

	public int getInfo(){
		return info;
	}
}