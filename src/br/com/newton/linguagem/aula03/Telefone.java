package br.com.newton.linguagem.aula03;

public class Telefone {

    public String marca;
    public String marca2;
    public String cor;

    public String cor2;

    public void Tocar(String estiloMusical){

        System.out.println("Tocando" + estiloMusical);

    }

        public void Ligar (String ligação){
        if (cor2 == "Preto") {
            System.out.println("Ligando" + ligação);
        }

    }
    Contato contato;
    Contato contatoA;
    Contato contatoB;
    Contato contatoC;
}
