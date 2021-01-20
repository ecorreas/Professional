public class ListaDupla{
	private NoDuplo inicio;
	private NoDuplo fim;
	
	public ListaDupla(){
		inicio = null;
		fim = null;
	}

	public void add(int info){
		NoDuplo novo = new NoDuplo(info);

		if(inicio == null){
			inicio = novo;
			fim = novo;
		}
		else{
			fim.setProx(novo);
			novo.setAnt(fim);
			fim = novo;
		}
	}
	
	public int get(int indice){
		NoDuplo aux = inicio;
		int cont = 0;

		while(aux != null){
			if(cont == indice){
				return aux.getInfo();
			}
			else{
				aux = aux.getProx();
			}
		}
		return -1;
	}
	
	public boolean contains(int info){
		NoDuplo aux = inicio;

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
	
	public int indexOf(int info){
		NoDuplo aux = inicio;
		int cont = 0;

		while(aux != null){
			if(aux.getInfo() == info){
				return cont;
			}
			else{
				cont++;
				aux = aux.getProx();	
			}		
		}
		return -1;
	}

	public boolean isEmpty(){ 
		return inicio == null;
	}
	
	public NoDuplo pesquisa(int info){
		NoDuplo aux = inicio;

		while(aux!=null){
			if(aux.getInfo() == info){
				return aux;
			}
			else{
				aux = aux.getProx();
			}
		}
		return null;
	}
	
	public boolean remove(int info){
		NoDuplo aux = pesquisa(info);

		if(aux != null){
			if(aux==inicio && aux== fim) {
				inicio = null;
				fim = null;
			}
			else if(aux == inicio){
				inicio.getProx().setAnt(null);
				inicio = inicio.getProx();
			}
			else if(aux == fim){
				fim.getAnt().setProx(null);
				fim = fim.getAnt();
			}
			else{
				aux.getAnt().setProx(aux.getProx());
				aux.getProx().setAnt(aux.getAnt());
			}
			return true;
		}
		return false;
	}
	
    
    public void selectionSort(){
		NoDuplo aux1, aux2, menor;
		int auxInfo;
		aux1 = inicio;

		while(aux1 != null){
			menor = aux1;
			aux2 = aux1.getProx();
			while(aux2!=null){
				if(menor.getInfo() > aux2.getInfo()){
					menor = aux2;
				}
				else{
					aux2 = aux2.getProx();
				}
			}
			auxInfo = aux1.getInfo();
			aux1.setInfo(menor.getInfo());
			menor.setInfo(auxInfo);
				
			aux1 = aux1.getProx();
		}
	}
	
	public String toString(){
		NoDuplo aux = inicio;
		String s= "";
		while(aux!=null){
			s+= aux.getInfo() + " ";
			aux = aux.getProx();	
		}
		return s;
	}
	
	public String toStringReverse(){
		NoDuplo aux = fim;
		String s= "";
		while(aux!=null){
			s+= aux.getInfo() + " ";
			aux = aux.getAnt();	
		}
		return s;
	}
}