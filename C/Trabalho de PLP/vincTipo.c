#include<stdio.h>
#include<stdin.h>

int main(){
    //tipo de float é vinculado em tempo de compilação
    float saldo = 0; 
    //Vinculação a um tipo primitivo ou seja explícita
    //conjunto de valoress de deposito é vinculado no projeto da linguagem/compilador
    float deposito;

    printf("Digite o valor do deposito: \n");
    scanf("%f", &deposito);

    //Vinculação Dinâmica
    //aqui a variável é vinculada em tempo de execução
    saldo = saldo + deposito; 

    return 0;
}