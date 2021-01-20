#include <stdio.h>

void nulo(int n)
{
	if(n == 0)
		printf("O numero %i e nulo\n", n);
	else
		printf("O numero %i nao e nulo\n", n);
}

int main(void)
{
	int n;

		printf("Digite um numero:\n");
		scanf("%i", &n);

		nulo(n);
}
cd