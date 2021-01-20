#include<stdio.h>
#include<stdlib.h>
#include<string.h>

//declaramos nossa struct de acordo com os requisitos
typedef struct filme{
    int codigo;
	char titulo[100];
	int ano;
	int qtd;
	char genero[30];
}FILME;

//função que faz a leitura do arquivo e retorna erro caso não consiga fazê-lo
FILE *abrirArquivo()
{
    FILE *arq = fopen("input.txt", "r");
    
    if(arq == NULL){
    	printf("Erro na abertura do arquivo\n");
    	exit(0);
    }   
    return arq;
}

//função que pega a primeira linha do arquivo, no caso a quantidade total de filmes
typedef FILE (*arquivo)(int);
int qtdTotalFilmes(FILE *arquivo)
{
    int qtdTotal = 0;

    fscanf(arquivo, "%d\n", &qtdTotal);

    return qtdTotal;

}

//função que preencherá nossa struct
typedef FILE (*arq)(void);
void preencherStruct(FILE *arq, FILME *filmes, int qtd)
{
    //declaramos um vetor de char(string) com tamanho de 100 para receber cada linha do arquivo
    char line[100];

    //declaramos nossos delimitadores que serão os ;
    char s[3] = ";";
    
    //string para guardar cada campo separado pelo delimitador
    char *campo;
	
    //variável para auxiliar na contagem de linhas que vamos percorrer
	int countFilmes = 0;

        //atribui um codigo para cada filme
        for(int i = 0; i < qtd; i++){
            filmes[i].codigo = i;
        }

        //executa enquanto nao achar o final de arquivo
        while(!feof(arq)){

            //pega cada linha com tamanho de 100 do arq(arquivo)
            fgets(line, 100, arq);

            //realiza a separação de cada linha pelo delimitador e salva na variável campo
            campo = strtok(line, s);	

            //após isso, criamos uma matriz para guardar os valores em cada campo, são eles: titulo, ano, qtd e genero
            char l[4][100];

            //variável para percorrer a matriz
            int i = 0;

            //enquanto nosso campo não estiver vazio, preenchemos os campos na matriz
            while(campo != NULL){

                strcpy(&l[i][0], campo);
                //precisamos declarar como NULL para que ele possa pegar o próximo campo
                campo = strtok(NULL, s);
                i++;
            }

            //usamos a função strcpy para copiar o conteúdo de uma string para outra
            //aqui estamos preenchendo nossa primeira linha da matriz, que corresponde ao titulo
            strcpy(filmes[countFilmes].titulo, &l[0][0]);

            //primeiramente fazemos a conversão da string para inteiro
            //aqui estamos preenchendo nossa segunda linha da matriz, que corresponde ao ano
            int castAno = atoi(&l[1][0]);
            filmes[countFilmes].ano = castAno;

            //também precisamos fazer a conversão, pois recebemos uma string
            //estamos preenchendo a quantidade
            int castQtd = atoi(&l[2][0]);
            filmes[countFilmes].qtd = castQtd;

            //mesmo caso que usamos para o titulo
            //e por fim, preenchemos o genero
            strcpy(filmes[countFilmes].genero, &l[3][0]); 
            countFilmes++;	
        }
}

//função que realiza a busca pelo código do filme
int buscarCodigo(FILME *filmes, int qtdT, int codigo)
{

//definimos esta variável para executar o while até que seja = 1
int encontrado = 0;

    do{
        for(int i = 0; i < qtdT; i++){

            if(filmes[i].codigo == codigo){
                //Imprime relatorio do filme buscado
  		    fflush(stdout);
  		
                printf("\nCodigo: %d\n", filmes[i].codigo);

                printf("Titulo: %s\n", filmes[i].titulo);

                printf("Ano: %d\n", filmes[i].ano);

                printf("Quantidade: %d\n", filmes[i].qtd);

                printf("Genero: %s\n", filmes[i].genero);
                encontrado = 1;
                return filmes[i].codigo;
                break;
            }
        }if(!encontrado){
            printf("Codigo invalido! Digite novamente:\n");
            return 0;
            break;
        }

    }while(!encontrado);
}

//busca por titulo
void buscarTitulo(FILME *filmes, int qtdT, char *busca){

//definimos esta variável para executar o while até que seja = 1
int encontrado = 0;

    do{
        for(int i = 0; i < qtdT; i++){

            if(strcmp(filmes[i].titulo, busca) == 0){
            
            	fflush(stdout);
                //Imprime relatorio do filme buscado
                printf("\nCodigo: %d\n", filmes[i].codigo);

                printf("Titulo: %s\n", filmes[i].titulo);

                printf("Ano: %d\n", filmes[i].ano);

                printf("Quantidade: %d\n", filmes[i].qtd);

                printf("Genero: %s\n", filmes[i].genero);
                encontrado = 1;
                break;   
            }
        }if(!encontrado){
            printf("Titulo nao encontrado!\n");
            break;
        }
    }while(!encontrado);
}

//Busca todos filmes de um determinado genero
void relatorioGenero(FILME *filmes, int qtdT, char *busca){

//definimos esta variável para executar o while até que seja = 1
int encontrado = 0;

    do{
        for (int i = 0; i < qtdT; i++){

            if(strcmp(filmes[i].genero, busca) == 0){
            
            	fflush(stdout);
                //Imprime relatorio do filme buscado
                printf("\nCodigo: %d\n", filmes[i].codigo);

                printf("Titulo: %s\n", filmes[i].titulo);

                printf("Ano: %d\n", filmes[i].ano);

                printf("Quantidade: %d\n", filmes[i].qtd);

                printf("Genero: %s\n", filmes[i].genero);
                encontrado = 1;
            }
        }if(!encontrado){
            printf("Genero nao encontrado!\n");
            break;
        }
    }while(!encontrado);
}   

//Busca todos filmes de um determinado ano
void relatorioAno(FILME *filmes, int qtdT, int ano){

//definimos esta variável para executar o while até que seja = 1   
int encontrado = 0;

    do{
        for (int i = 0; i < qtdT; i++){

            if(filmes[i].ano == ano){
            	fflush(stdout);
                //Imprime relatorio do filme buscado
                printf("\nCodigo: %d\n", filmes[i].codigo);

                printf("Titulo: %s\n", filmes[i].titulo);

                printf("Ano: %d\n", filmes[i].ano);

                printf("Quantidade: %d\n", filmes[i].qtd);

                printf("Genero: %s\n", filmes[i].genero);
                encontrado = 1;
            }
        }if(!encontrado){
            printf("Ano nao encontrado!\n");
            break;
        }
    }while(!encontrado);
    
}

//função que realiza a busca por codigo ou titulo
void buscarFilme(FILME *filmes, int qtd, char *busca)
{
int opc;
int convInt;

    do{    
        fflush(stdout);
        printf("#---------------------------------------------------------#\n");
        printf("#       Escolha por qual opcao voce deseja buscar:        #\n");
        printf("#---------------------------------------------------------#\n");
        printf("#                   1. Codigo.                            #\n");
        printf("#                   2. Titulo.                            #\n");
        printf("#                   0. Voltar ao menu anterior.           #\n");
        printf("#---------------------------------------------------------#\n");
        printf(">>");
        scanf("%d", &opc);
        setbuf(stdin, NULL);

        switch(opc){

            case 0:

                system("cls || clear");
                opc = 0;
                break;
            
            case 1:
                //caso seja um codigo, precisamos converter nossa busca para inteiro com a função atoi
                convInt = atoi(busca);
                printf("Digite o codigo:\n");
                scanf("%d", &convInt);
                buscarCodigo(filmes, qtd, convInt);
                break;     
            
            case 2:

                printf("Digite o titulo:\n");
                scanf("%[^\n]s", busca);
                buscarTitulo(filmes, qtd, busca);
                break;

            default:
                printf("Opcao invalida! Tente novamente.\n");
      }
    }while(opc != 0);
}

//precisamos fazer essa função, pois nosso campo genero foi preenchido com o \n no final
//e isso ocasionou uma falha ao precisar compara-lô com uma string
char *tratarString(FILME *filmes, int qtdT)
{
    char *c;
    char *br = "\n";      

    for(int i = 0; i < qtdT; i++){
        c = strtok(filmes[i].genero, br);
        strcpy(filmes[i].genero, c);
        c = strtok(NULL, br);
    }
}

//gera relatorio de acordo com a opção escolhida
void gerarRelatorio(FILME *filmes, int qtd, char *busca)
{
int opc;
int convInt;
    
    do{
        fflush(stdout);
        printf("#---------------------------------------------------------#\n");
        printf("#  Escolha por qual opcao voce deseja gerar o relatorio:  #\n");
        printf("#---------------------------------------------------------#\n");
        printf("#                   1. Genero.                            #\n");
        printf("#                   2. Ano.                               #\n");
        printf("#                   0. Voltar ao menu anterior.           #\n");
        printf("#---------------------------------------------------------#\n");
        printf(">>");
        scanf("%d", &opc);
        setbuf(stdin, NULL);
        switch(opc){

            case 0:

                system("cls || clear");
                opc = 0;
                break;
            
            case 1:

                printf("Digite o genero:\n");
                scanf("%[^\n]s", busca);
                tratarString(filmes, qtd);
                relatorioGenero(filmes, qtd, busca);
                break;   
            
            case 2:
                //novamente como se trata do ano, tão logo precisamos converte-lô para inteiro
                convInt = atoi(busca);
                printf("Digite o ano:\n");
                scanf("%d", &convInt);
                relatorioAno(filmes, qtd, convInt);
                break;

            default:
                printf("Opcao invalida! Tente novamente.\n");
      }
    }while(opc != 0);
}

//função que imprime o acervo completo de filmes
void imprimirAcervo(FILME *filmes, int qtdT)
{
    for(int i = 0; i < qtdT; i++){
		fflush(stdout);
		
        printf("\nCodigo: %d\n", filmes[i].codigo);

		printf("Titulo: %s\n", filmes[i].titulo);

		printf("Ano: %d\n", filmes[i].ano);

		printf("Quantidade: %d\n", filmes[i].qtd);

		printf("Genero: %s\n", filmes[i].genero);
	}
}
//função que retira um filme da quantidade do acervo
int locarFilme(FILME *filmes, int qtd, int locados[][2]){
    
int codigo;
int opc;
int indice;

    do{
    	fflush(stdout);
        printf("#---------------------------------------------------------#\n");
        printf("#                       Locar:                            #\n");
        printf("#---------------------------------------------------------#\n");
        printf("#               Digite o codigo do filme:                 #\n");
        printf("#---------------------------------------------------------#\n");
        printf(">>");
        scanf("%d", &codigo);
        setbuf(stdin, NULL);

        indice = buscarCodigo(filmes, qtd, codigo);

    }while(indice != codigo);
        
        printf("Deseja locar esse filme?\n");
        printf("1. SIM          2.NAO\n");
        printf(">>");
        scanf("%d", &opc);

        switch(opc){
            case 1:
                for(int i = 0; i < qtd; i++){
                    if(filmes[indice].qtd < locados[i][1]){
                        printf("Estoque nao disponivel\n");
                        break;
                    }
                    else{
                        locados[i][0] = filmes[indice].codigo;
                        filmes[indice].qtd -= 1;
                        locados[i][1] += 1;
                        printf("Filme alugado com sucesso!\n");
                        break;
                    }
                }
                break;

            case 2:
                system("cls || clear");
                opc = 0;
                break;

            default:
                printf("Opcao invalida!\n");
        }
        return locados;
}

//função que adiciona o filme novamente
int entregarFilme(FILME *filmes, int qtd, int locados[][2]){
    
int codigo;
int opc;
int indice;
    
    do{
    	fflush(stdout);
        printf("#---------------------------------------------------------#\n");
        printf("#                       Devolução:                        #\n");
        printf("#---------------------------------------------------------#\n");
        printf("#                   Digite o codigo do filme:             #\n");
        printf("#---------------------------------------------------------#\n");
        printf(">>");
        scanf("%d", &codigo);
        setbuf(stdin, NULL);

        indice = buscarCodigo(filmes, qtd, codigo);

    }while(indice != codigo);


        printf("Deseja devolver esse filme?\n");
        printf("1. SIM          2.NAO\n");
        printf(">>");
        scanf("%d", &opc);

        switch(opc){
            case 1:
                    for(int i = 0; i < qtd; i++){
                        if(filmes[indice].codigo != locados[i][0]){
                            printf("Este filme nao consta na lista de alugado\n");
                            break;
                        }
                        if(filmes[indice].codigo == locados[i][0] && filmes[indice].qtd <= locados[i][1]){
                            filmes[indice].qtd += 1;
                            locados[i][1] -= 1;
                            printf("Filme entregue com sucesso!\n");
                            break;
                        }
                    }
                    break;

            case 2:
                system("cls || clear");
                opc = 0;
                break;

            default:
                printf("Opcao invalida! Tente novamente.\n");
        }
        return locados;
}

//menu principal de opções
int menu()
{
    int opc;
    
    	fflush(stdout);
        printf("#---------------------------------Locadora do Alcemar---------------------------#\n");
        printf("#################################################################################\n");
        printf("#                              Escolha a opcao desejada:                        #\n");
        printf("#            1. Locacao                                                         #\n");
        printf("#            2. Entregar filme                                                  #\n");
        printf("#            3. Buscar filme                                                    #\n");
        printf("#            4. Gerar Relatorio                                                 #\n");
        printf("#            5. Imprimir acervo                                                 #\n");
        printf("#            0. Sair                                                            #\n");
        printf("#################################################################################\n");
	    printf(">>");
        scanf("%d", &opc);
        system("cls || clear");

        return opc;
}

//função principal de nosso programa
int main(){

    //utilizamos a função para abrir nosso arquivo
    FILE *arquivo = abrirArquivo();

    //aqui estamos pegando a quantidade total de filmes, que encontra-se na primeira linha do arquivo
    int qtdTotal = qtdTotalFilmes(arquivo);

    //criamos um vetor de struct de filmes
    FILME filmes[qtdTotal];

    //preenchemos a struct com cada campo em seu devido lugar
    preencherStruct(arquivo, filmes, qtdTotal);    

    //fechamos o arquivo após não utilizarmos mais
    fclose(arquivo);
    
    //variável para guardar a opção escolhida do menu
    int opc;
    
    //variável para guardar nossa busca(busca)
    char *busca;
    
    //aqui criamos uma matriz para representar a nossa lista de filmes locados.
    //Esta matriz têm inicialmente a quantidade total de linhas do documento por 2 colunas
    //a primeira coluna representará o código do filme locado e a segunda a quantidade
    int locados[qtdTotal][2];

        do{
            opc = menu();

            switch(opc)
            {
                case 0:
                    exit(0);
                
                case 1:
                    locarFilme(filmes, qtdTotal, locados);
                    break;
                case 2:
                    entregarFilme(filmes, qtdTotal, locados);
                    break;
                
                case 3:
                    buscarFilme(filmes, qtdTotal, busca);
                    break;          	 
                
                case 4:
                    gerarRelatorio(filmes, qtdTotal, busca);
                    break;

                case 5:
                    imprimirAcervo(filmes, qtdTotal);
                    break;

                default:
                    printf("Opcao invalida! Tente novamente.\n");  
            } 
        }while(opc != 0);
}