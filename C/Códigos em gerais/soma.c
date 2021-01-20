#include <stdio.h>

int soma(int a, int b)
{
	int c;
	c = a + b;
	return c;
}

int main()
{
	int num1,
	    num2,
	    result;
	
	printf("Digite dois numeros\n");
	scanf("%i %i", &num1, &num2);

	result = soma(num1,num2);
	
	printf("Resultado: %i\n", result);
}


