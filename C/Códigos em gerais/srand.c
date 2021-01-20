#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int n_sorteado();
void dicas(int num, int senha, int tentativas);

int main()
{
	int continuar=1,
		num,
		senha,
		tentativas;

	do
	{
		system("clear");
		printf("Sorteando numero de 1 a 1000...\n");
		senha = n_sorteado();

		printf("Comecou! tente advinhar.\n");
		tentativas = 0;
	
		do
		{
			tentativas++;
			printf("Tentativa numero %i:\n", tentativas);
			scanf("%i", &num);
			dicas(num, senha, tentativas);
		}
		while(num != senha);
		printf("Digite 0 para sair ou qualquer outro numero para continuar\n");
		scanf("%i", &	continuar);
	}
	while(continuar);

}


int n_sorteado()
{
	srand((unsigned)time(NULL));
	return (1 + rand() % 1000);
}

void dicas(int num, int senha, int tentativas)
{
	if (num > senha)
	
		printf("O numero e menor que %i\n", num);
	else

		if (num < senha)
	
		printf("O numero e maior que %i\n", num);
	
	else
		printf("Voce acertou! Precisou de %i tentativas\n", tentativas);

	
}