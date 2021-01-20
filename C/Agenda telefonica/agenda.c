#include <stdio.h>

#define TAM_AGENDA 3

typedef struct Agenda
{
	char nome[30];
	int idade;
	char telefone[20];
}AGENDA;

void preencherAgenda(AGENDA *agenda, int count)
{	
	for(count = 0 ; count < TAM_AGENDA ; count++)
	{	
		printf("\nNome da pessoa %d: ", count+1);
		scanf("%[^\n]s", agenda[count].nome);
		setbuf(stdin, NULL);

		printf("Telefone: ");
		scanf("%[^\n]s", agenda[count].telefone);
		setbuf(stdin, NULL);

		printf("Idade: ");
		scanf("%d", &agenda[count].idade);
		setbuf(stdin, NULL);
	}
}

void exibirAgenda(AGENDA *agenda, int count)
{	
	printf("\nExibindo agenda:\n");

	for(count = 0 ; count < TAM_AGENDA ; count++)
	{
		printf("\nPessoa %i\n", count+1);
		printf("Nome: %s\n", agenda[count].nome);
		printf("Telefone: %s\n", agenda[count].telefone);
		printf("Idade: %i\n", agenda[count].idade);
		
	}
}

int main(void)
{
	int count;
	AGENDA agenda[TAM_AGENDA];	
	preencherAgenda(agenda, count);
	exibirAgenda(agenda, count);	
return 0;
}
