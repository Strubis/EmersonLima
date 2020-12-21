#include <string.h>
#include <stdio.h>

int main(){
    char string[30];

    printf("Escreva seu nome: ");
    fgets( string, 30, stdin );
    string[strlen(string) - 1] = '\0';

    printf("Seu nome eh: ");
    puts( string );

    return 0;
}
