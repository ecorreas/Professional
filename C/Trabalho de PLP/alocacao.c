#include<stdio.h>
#include<stdlib.h>

int main(){
    float notas*;
    int i, qtd_alunos;

    printf("Informe a quantidade de alunos:\n");
    scanf("%d", &qtd_alunos);

    //Alocação dinâmica de memória, realizada pela função malloc
    notas = (float *) malloc(qtd_alunos * sizeof(float));

    for(i = 0; i < qtd_alunos; i++){
        scanf("%f", &notas[i]);
    }
    ...

    free(notas);
    return 0;
}