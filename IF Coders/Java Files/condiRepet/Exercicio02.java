package condiRepet;

import java.util.Scanner;

/**
 * Escreva um programa para ler o saldo inicial de uma conta bancária,
 * um valor decimal. A seguir ler um número indeterminado de pares de valores indicando
 * respectivamente o tipo da operação (codificado da seguinte forma: 1.Depósito
 * 2.Retirada e 3.Fim) e o valor que será movimentado. Quando for informado para o
 * tipo da operação o código 3, o programa deve ser encerrado e impresso o saldo final
 * da conta com as seguintes mensagens: “Sem saldo.” caso o saldo seja zero, “Conta
 * devedora.”, se o saldo for negativo ou “Conta preferencial.”, se o saldo seja positivo.
 * Caso seja fornecido umtipo incorreto de operação, ou seja, diferente de 1, 2 ou 3, o programa
 * deve exibir ao usuário a mensagem“Operacao invalida.” e solicitar novamente
 * a operação. Formate a saída dos números decimais usando 2 casas de precisão. 
 * 
 * COLETÂNEA DE EXERCÍCIOS E NOTAS DE AULA EM LINGUAGEM DE PROGRAMAÇÃO C - Profº Dr David Buzatto
 *
 * 
 * @since 01/12/2020
 * @see classe
 * @author Emerson Lima, Nicholas Zilli
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.print("Saldo Inicial: ");
        double saldoIni = tec.nextDouble();
        
        System.out.println("Operacoes: \n"
                + "\t1) Deposito;\n"
                + "\t2) Saque;\n"
                + "\t3) Fim.");
        
        char op;
        double saldoFin = 0;
        do{
            System.out.print("-> ");
            op = tec.next().charAt(0);
            
            switch(op){
                case '1':
                    System.out.print("\nValor para depositar: ");
                    saldoFin = tec.nextDouble();
                    saldoIni += saldoFin;
                    break;
                    
                case '2':
                    System.out.print("\nValor para sacar: ");
                    saldoFin = tec.nextDouble();
                    saldoIni -= saldoFin;
                    break;
                
                case '3':
                    break;
                    
                default:
                    System.err.println("\nOpcao invalida!");
                    break;
            }
        }while(op != '3');
        
        if ( saldoIni == 0 ) {
            System.out.println("\nSaldo final: R$ " + saldoIni + "\nSem saldo.");
        }else{
            System.out.println(saldoIni > 0? "\nSaldo final: R$ " + saldoIni +
                                        "\nConta preferencial.":
                "\nSaldo final: R$ " + saldoIni + "\nConta devedora");
        }

    }
}
