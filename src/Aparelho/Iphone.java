package Aparelho;

import Apps.MusicPlayer;
import Apps.Opera;
import Apps.Telefone;

public class Iphone implements MusicPlayer, Opera, Telefone {
    @Override
    public void tocar() {
        System.out.println("Tocando musica ...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica ...");
    }

    @Override
    public void selecionarMuscia() {
        System.out.println("Selecionando musica ...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página pelo navegador Opera...");
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adicionando uma nova aba de navegação...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página de navegação...");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação via Iphone...");
    }

    @Override
    public void Atender() {
        System.out.println("Atendendo ligação recebida via Iphone...");
    }

    @Override
    public void IniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
