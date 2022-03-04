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
public class PessoaController extends Pessoa{
    Scanner scan = new Scanner(System.in);

    //MOSTRAR
    public int mostraSaldo() {

        System.out.println("Saldo atual:  \n R$" + saldo);
        return saldo;
    }

    //DEPOSITO
    public int depositar() {
        System.out.println("Digite o valor em R$ a depositar");
        int valor = scan.nextInt();
        setSaldo(saldo + valor);

        System.out.println("Saldo atual:  \n R$" + saldo + "\n");
        return saldo;
    }

    //SAQUE
    public boolean sacar() {

        System.out.println("Digite o valor em R$ a sacar");
        int valor = scan.nextInt();

        if (this.saldo < valor) {
            //System.err.println("Valor insuficiente para sacar \n");
            return false;
        }
        setSaldo(saldo - valor);
        System.out.println("Saldo atual:  \n R$" + saldo);
        return true;

    }

    public PessoaController(String name) {
        this.name = name;
    }
    
    public String cadastrarNome(){
        this.name = scan.next();
        return name;
    }


    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
