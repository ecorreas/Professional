#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void menu()
{
	printf("\t\tBem Vindo ao jogo de advinhar numeros!\n\n");
	printf("Tente advinhar um numero de 1 a 1000\n\n");
	printf("Voce tera 10 tentativas\n");
}
	
int main()
{
    int x, y;
    int i=10;
  
	do
    {

    		menu();
    		if(i == 0){
    			printf("Acabou sua chances!\n");
    			break;
    		}
    		printf("Agora voce tem %i tentativas\n", i);
    	
    		scanf("%i", &x);
    		y = 1 + (rand() % 1000);

    		if( x > 1000 )
    	{
    		printf("Este numero esta fora do intervalo! Tente novamente\n");
    		
    	}

    	if( x == y )
    	{
    		printf("Voce acertou!\n");
    		break;    		
    	}

    	i--;

    }while(x != y);

}