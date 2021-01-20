package JavaApp;

public class MatrizReal implements IMatrizReal{

    public float tabela[][];
    int m, n;

    public void definirTabela(int m, int n){
        this.tabela = new float[m][n];
        this.m = m;
        this.n = n;
    }

    public float modificarValor(float valor, int m, int n){
        return this.tabela[m][n] = valor;
    }

    public float acessarValor(int m, int n){
        return this.tabela[m][n];
    }

    public int numLinhas(){
        return this.m;
    }

    public int numColunas(){
        return this.n;
    }
    public int tamanhoMatriz(){
        return this.m * this.n;
    }
}
