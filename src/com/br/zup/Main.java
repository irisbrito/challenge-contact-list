package com.br.zup;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    /* Os alunos devem criar um programa para gerenciar uma lista de contatos,
     cada contato tem nome, telefone e email.
     No programa final deve ser aplicado a uma lista de contatos cadastrados.
     */

    public static Scanner createScanner(){
        return new Scanner(System.in);
    }

    public static void main(String[] args) {
    Map<String, List<String>> listaContatos = new HashMap<>();

    boolean continuar = true;

        while(continuar){
            System.out.println("Digite 1 para cadastrar contato ou 2 para deletar contato");
            int respostaMenu = createScanner().nextInt();
            if(respostaMenu == 1){
                System.out.println("Digite um nome para cadastrar");
                String nome = createScanner().nextLine();
                System.out.println("Digite o email do contato");
                String email = createScanner().nextLine();
                if(listaContatos.containsKey(email)){
                    System.out.println("E-mail já cadastrado!");
                }
                System.out.println("Digite o telefone do contato");
                String telefone = createScanner().nextLine();
                listaContatos.put(email, Arrays.asList(nome, email, telefone));
                System.out.println("Usuário cadastrado! \n Nome: " +nome+" \nEmail: "+ email + "\nTelefone: "+ telefone);
                System.out.println(listaContatos);
                System.out.println("Deseja cadastrar mais um contato? Digite sim ou sair para finalizar");
                String resposta = createScanner().nextLine();
                if(resposta.equalsIgnoreCase("sair")){
                    continuar = false;
                }
            } else if(respostaMenu == 2){
                System.out.println("Digite o e-mail do contato à ser deletado");
                String email = createScanner().nextLine();
                if(listaContatos.containsKey(email)){
                    listaContatos.remove(email);
                    System.out.println("Contato deletado com sucesso!");
                    continuar = false;
                } else {
                    System.out.println("O e-mail indicado não está cadastrado");
                }
            }

        }


    }
}
