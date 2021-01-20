#include<stdlib.h>

int max = 100; // alocação estática

int main (){
    float a = 8.5; // alocacão dinâmica na pilha
    int b = a;

    printf("%d", b);

    return 0;
}