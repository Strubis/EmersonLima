#include <stdio.h>
#include <stdlib.h>

int main(){
    int matriz[3][3];
    int linhas = (int) ( sizeof(matriz) / sizeof(matriz[0]) );
    int colunas = (int) ( sizeof(matriz[0]) / sizeof(matriz[0][0]) );

    for(int i = 0; i < linhas; i++){
        for(int j = 0; j < colunas; j++){
            printf("Matriz[%d][%d] = ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("\nValores da matriz:\n");

    for(int i = 0; i < linhas; i++){
        for(int j = 0; j < colunas; j++){
            printf("Matriz[%d][%d] = %d\n", i, j, matriz[i][j]);
        }
    }

    return 0;
}
