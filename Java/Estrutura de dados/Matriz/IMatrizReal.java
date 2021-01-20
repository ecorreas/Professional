package JavaApp;

public interface IMatrizReal{
    public void definirTabela(int m, int n);
    public float modificarValor(float valor, int m, int n);
    public float acessarValor(int l, int c);
    public int numLinhas();
    public int numColunas();
    public int tamanhoMatriz();
}