#include <stdio.h>
#include <stdlib.h>

void oi()
{
	printf("Oi\n");
}

void tudo_bem()
{
	printf("Tudo bem e com voce?\n");
}

void familia()
{
	printf("A minha familia vai bem\n");
}

void sair()
{
	printf("Ja vai? Nao espera! Nao Nao Na...\n");
}

int main()
{
	int continuar = 1;

	do
	{
		printf("\t\tChat Forever Alone Evandro!\n");
		printf("1. Oi!\n");
		printf("2. Tudo bem?\n");
		printf("3. Como vai a familia?\n");
		printf("0. Sair\n");

		scanf("%i", &continuar);
		system("clear");

		switch(continuar)
		{
			case 1:
				oi();
				break;
			
			case 2:
				tudo_bem();
				break;
			
			case 3:
				familia();
				break;

			case 0:
				sair();
				break;

			default:
				printf("Digite uma opcao valida!\n");
		}
	}while(continuar);
}




