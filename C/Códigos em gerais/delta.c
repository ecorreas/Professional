#include <stdio.h>
#include <math.h>


double bhaskara(int a, int b, int c)
{
	double delta = pow(b,2) - (4 *a*c);
	return delta;
}
	
int main(void)
{
	int x,
		y,
		z;
		

		printf("Digite o valor de a,b,c:\n");
		scanf("%i %i %i", &x,&y,&z);

		double delta = bhaskara(x,y,z);

		printf("O valor do delta e: %f\n", delta);
}