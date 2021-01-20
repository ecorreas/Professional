package JavaApp;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IMatrizReal matriz = new MatrizReal();

        System.out.println("Digite o tamanho da tabela:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        matriz.definirTabela(m, n);

        System.out.println("Digite os valores:");
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz.modificarValor(sc.nextFloat(), i, j);
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.println(matriz.acessarValor(i, j));
            }
        }
}
}
