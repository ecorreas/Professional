//Implementação da classe pilha, com ponteiro para o topo da pilha
public class Pilha{
    No topo;

//verifica se a pilha é vazia
public boolean isEmpty(){
    return (topo == null);
}

//insere um elemento na pilha
public boolean push(int num){
    No novo = new No(num);
    
    if(ehVazia()){
        topo = novo;
    }
    else{
        novo.setProx(topo);
        topo = novo;
    }
    return true;
}

//remove(desempilha) um elemento da pilha
public int pop(){
    int info = null;
    
    if(topo != null){
        info = topo.getInfo();
        topo = topo.getProx();
    }
    return info;
}

//retorna o topo da pilha
public int top(){
    int info = null;
    
    if(topo != null){
       info = topo.getInfo();
       topo = topo.getProx();
   }
   return info;
} 

//retorna o número de elementos na pilha
public int size(){
    int count = 0;
    No aux = topo;

    while(aux.getProx() != null){
        count++;
        aux = aux.getProx();
    }
    return count;
}

//retorna o maior número armazenado na pilha, caso contrário, retorna -1
public int maior(){
    int maior = -1;
    int aux = 0;

    if(ehVazia()){
        return maior;
    }
    else{
        maior = pop();
        while(!ehVazia()){
            aux = pop();
            if(maior < aux){
                maior = aux;
            }
        }
        return maior;
    }
}

//retorna o menor número armazenado na pilha, caso contrário, retorna -1
public int menor(){
    int menor = -1;
    int aux = 0;

    if(ehVazia()){
        return menor;
    }
    else{
        menor = pop();
        while(!ehVazia()){
            aux = pop();
            if(menor > aux){
                menor = aux;
            }
        }
        return menor;
    }
}

//exibe todos elementos armazenados na pilha
public String toString(){
    No aux = this.topo;
    String info = "";

    while(aux != null){
        info = aux.getInfo() + " ";
        aux = aux.getProx();
    }
    return info;
}