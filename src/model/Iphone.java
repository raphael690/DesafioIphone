package model;

import model.interf.AparelhoTelefonico;
import model.interf.NavegadorInternet;
import model.interf.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    @Override
    public void ligar(){
        System.out.println("Ligando...!");
    }

    @Override
    public void atender(){
        System.out.println("Atender!");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando Correio de Voz...!");
    }

    @Override
    public void tocar(){
        System.out.println("Reproduzindo música!");
    }
    @Override
    public void pausar(){
        System.out.println("Pausar Música!");
    }
    @Override
    public void selecionarMusica(){
        System.out.println("Selecionar Música:" );
    }
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo Página!");
    }
    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba!");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Página sendo atualizada!");
    }




    public static void main(String[] args){
        Iphone iphone =  new Iphone();

        System.out.println("Teste do Aparelho Telefônico");

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("\n");

        System.out.println("Teste do Reprodutor Musical");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
       
        System.out.println("\n");

        System.out.println("Teste do Navegador na Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }



}