#include <stdio.h>
#include <stdlib.h>

void soma(float a, float b)
{
	printf("%.2f\n", a+b );
}

void subtracao(float a, float b)
{
	printf("%.2f\n", a-b );
}

void divisao(float a, float b)
{
	if(b != 0)
		printf("%.2f\n", a/b );
	else
		printf("Nao pode divisor por zero\n");
}

void multiplica(float a, float b)
{
	printf("%.2f\n", a*b );
}

int main()
{
	float num1,
	      num2;
	 char oper;

	 do
	 {
	 	printf("\t\tCalculadora\n");
	 	printf("'+' : soma\n");
	 	printf("'-' : subtracao\n");
	 	printf("'/' : divisao\n");
	 	printf("'*' : multiplica\n");

	 	printf("Digite a expressao na forma: numero1 oper numero2\n");
	 	printf("Exemplo: 1 * 1 ou 2.3 + 2.1\n");
	 	printf("Para sair digite 0 0 0\n");

	 	scanf("%f", &num1);
	 	scanf("%c", &oper);
	 	scanf("%f", &num2);

	 	system("clear");

	 	printf("Calculando %.2f %c %.2f = \n", num1, oper, num2 );

	 	switch(oper)
	 	{
	 		case '+':
	 					soma(num1, num2);
	 					break;

	 		case '-':
	 					subtracao(num1, num2);
	 					break;

	 		case '/':
	 					divisao(num1, num2);
	 					break;

	 		case '*':
	 					multiplica(num1, num2);
	 					break;

	 		default:
	 				if(num1 != 0 && oper != '0' && num2 != 0)
	 					printf("Operador invalido!\n");

	 				else
	 					printf("Fechando calculadora!\n");

	 	}

	 }while(num1 != 0 && oper != '0' && num2 != 0);
}
