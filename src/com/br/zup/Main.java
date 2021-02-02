package com.br.zup;

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

        System.out.println("Digite um nome para cadastrar");
        String nome = createScanner().nextLine();
        System.out.println("Digite o email do contato");
        String email = createScanner().nextLine();
        System.out.println("Digite o telefone do contato");
        String telefone = createScanner().nextLine();
        listaContatos.put(email, Arrays.asList(nome, email, telefone));
        System.out.println("Usuário cadastrado! \n Nome: " +nome+" \nEmail: "+ email + "\nTelefone: "+ telefone);
        System.out.println(listaContatos);

    }
}
