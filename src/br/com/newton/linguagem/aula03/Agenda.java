package br.com.newton.linguagem.aula03;

public class Agenda {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        Contato contato1 = new Contato();
        Contato contato2 = new Contato();
        contato1.nome = "Rafaela";
        contato1.numero = "123456";
        telefone.marca = "Iphone";
        telefone.cor = "Vermelho";
        contato2.nome = "João";
        contato2.numero = "318989952";


        telefone.contato = contato1;
        telefone.contatoA = contato2;
        telefone.Tocar(" Pagode");

        System.out.println(telefone.contato.nome);
        System.out.println(telefone.contatoA.nome + ", " + telefone.marca + ", " + telefone.contatoA.numero);

    }
}