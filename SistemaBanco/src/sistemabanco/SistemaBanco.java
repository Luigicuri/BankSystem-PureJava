/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

import java.util.Scanner;

/**
 *
 * @author Luigi
 */
public class SistemaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String nameUser;
        System.out.println("Digite seu nome:");
        PessoaController user = new PessoaController(nameUser = scan.next());
        
        try {    
        do {
            System.out.println("\n Bem-vindo(a), " + user.name + "\n");
            System.out.println("DIGITE A OPÇÃO");
            System.out.println("[1] - Consultar Saldo");
            System.out.println("[2] - Depositar");
            System.out.println("[3] - Sacar");
            System.out.println("[4] - Sair");
            int op = scan.nextInt();

            switch (op) {
                case 1:

                    user.mostraSaldo();
                    break;
                case 2:

                    user.depositar();
                    break;
                case 3:
                    user.sacar();
                    break;
                case 4:
                    System.out.println("Sessão encerrada");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;
            }
        } while (true);
        } catch (Exception e) {
            System.out.println("Valor digitado incorreto, reinicie o programa");
        }
        
        
        

    }
    
}
