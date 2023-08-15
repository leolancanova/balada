package br.senai.sp;

import java.util.Scanner;

public class Balada {
    public static void main(String[] args) {
        /** declarar as variaveis */

        String nome, nomeAcompanhante;
        int idade,idadeAcompanhante=0;
        long cpf,cpfAcompanhante;
        boolean continuar=true;

                /**instalar Scanner*/

        Scanner teclado = new Scanner(System.in);
        while (continuar){

        }
        /** coletar dados */

        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Bem vindo a nossa balada");
        System.out.println("Qual é seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Ola " + nome + "Qual é seu cpf");
        cpf = teclado.nextLong();
        System.out.println("Qual sua idade: ");
        idade = teclado.nextInt();
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        /** condiçoes da balada*/

        if (idade >= 18  && idade % 2 == 0) {
            System.out.println("entrada liberada fique avontade !! ");
        }else if ( idade >= 18 && idade % 2==1){
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("Bem vindo a nossa balada");
            System.out.println("Qual é seu nome: ");
            nome = teclado.next();
            System.out.println("Ola " + nome + "Qual é seu cpf");
            cpf = teclado.nextLong();
            System.out.println("Qual sua idade: ");
            idade = teclado.nextInt();
            System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");


        }else{
            System.out.println("voce nao entra por ser de menor");
}

        if ((idade + idadeAcompanhante)% 2==0 && idadeAcompanhante >= 18){
            System.out.println("curtam bastante nossa balada");

        }else{
            System.out.println("vão embora !!");
            {
             /** avalia loop*/
                System.out.println("----------------");
                System.out.println("deseja continuar: [1-sim] [2-nao]");
                int opcao = teclado.nextInt();
                if (opcao == 2){
                  continuar=false;










                }






            }








        }



}
}