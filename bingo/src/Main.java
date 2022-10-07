import java.util.Scanner; // importa biblioteca Scanner
public class Main
{

    public static void main(String[] args)
    {
        int lin = 5, col = 5; // atribui valores a linhas e colunas
        int[][] cartela = new int[lin][col]; // cria a matriz "cartela" de inteiros com 5 linhas e 5 colunas
        int atual = 0; // cria a variável "atual" e a inicializa com o valor 0 


        System.out.println("Pressione ENTER para gerar a cartela"); // imprime uma instrução para o usuário uma vez
        Scanner s = new Scanner(System.in); // cria um objeto da classe Scanner
        s.nextLine(); // fica aguardando o usuário pressionar ENTER uma vez

        do // laço para repetir a criação da cartela enquanto o usuário não digitar "sair"
        {
            int min = 0; // cria a variável "min" e a inicializa com o valor 0
            int max = 0; // cria a variável "max" e a inicializa com o valor 0

            for (int y = 0; y < col; y++) // laço para varrer as colunas da matriz "cartela"
            {
                for (int x = 0; x < lin; x++) // laço para varrer as linhas da matriz "cartela"
                {
                    if (y == 0) // atribui os valores 1 para "min" e 15 para "max" para a coluna 01 da matriz "cartela"
                    {
                        min = 1;
                        max = 15;
                    }
                    if (y == 1) // atribui os valores 16 para "min" e 30 para "max" para a coluna 02 da matriz "cartela"
                    {
                        min = 16;
                        max = 30;
                    }
                    if (y == 2) // atribui os valores 31 para "min" e 45 para "max" para a coluna 03 da matriz "cartela"
                    {
                        min = 31;
                        max = 45;
                    }
                    if (y == 3) // atribui os valores 46 para "min" e 60 para "max" para a coluna 04 da matriz "cartela"
                    {
                        min = 46;
                        max = 60;
                    }
                    if (y == 4) // atribui os valores 61 para "min" e 75 para "max" para a coluna 05 da matriz "cartela"
                    {
                        min = 61;
                        max = 75;
                    }

                    cartela[x][y] = (int)Math.floor(Math.random()*(max-min+1)+min); // gera um número inteiro aleatório entre "min" e "max"
                    // e armazena na posição x,y da matriz "cartela"
                }
                for (int x = 0; x < lin; x++) // laço para verificar se foram gerados númeos repetidos em cada coluna da matriz "cartela"
                {
                    atual = cartela[x][y]; // armazena o valor atual da posição x,y da matriz "cartela"
                    for (int j = 0;j<lin; j++) // laço para varrer as linhas da matriz "cartela" - mantém x fixo em cada iteração
                    {
                        if (j!=x) // se j for diferente x (elementos diferentes da matriz), então conpara com os demais
                        {
                            if (cartela[j][y] == atual) // se o elemento da posição j,y for igual à atual, então modifica o valor do elemento
                            {
                                cartela[j][y] = (int)Math.floor(Math.random()*(max-min+1)+min);
                            }
                        }
                    }
                }
            }
            cartela[2][2]=99; // atribui o valor 99 na posição 2,2


            for (int x = 0; x < lin;x++) // laço para imprimir a matriz "cartela"
            {
                for (int y = 0; y < col; y++)
                {
                    System.out.print(cartela[x][y] + "\t"); // imprime os elementos de uma mesma linha com tabulação
                }
                System.out.println(); // pula uma linha
            }
            System.out.println(); // pula uma linha
            System.out.println("Pressione ENTER para gerar a cartela"); // imprime uma instrução para o usuário em cada iteração
        } while(!s.nextLine().equals("sair")); // verifica se a entrada do usuáio é diferente de "sair"
    }
}