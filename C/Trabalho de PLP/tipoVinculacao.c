#include<stdio.h>

// Vinculação em tempo de compilação 
#define IDADE_MIN 18 

int main(){
    //Vinculação em tempo de execução
    int idade = 40; 
    //Note que o "if" tem vinculação em tempo de projeto
    if(idade < IDADE_MIN){printf("Menor de 18 não pode tirar CNH.\n");}

    if(idade >= IDADE_MIN){printf("Liberado para fazer a CNH.\n");}

    return 0;
}