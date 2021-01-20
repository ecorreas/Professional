#include <stdio.h>

void positivo(int n)
{
	if(n > 0)
		printf("O numero %i e positvo\n", n);
	else
		printf("O numero %i e negativo\n", n);
}

int main(void)
{
	int n;

	printf("Digite um numero:\n");
	scanf("%i", &n);

	positivo(n);
}