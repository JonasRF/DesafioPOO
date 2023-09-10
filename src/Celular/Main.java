package Celular;

import Apps.MusicPlayer;
import Apps.Opera;
import Aparelho.Iphone;
import Apps.Telefone;

public class Main {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        MusicPlayer musicPlayer = iphone;
        Opera opera = iphone;
        Telefone telefone = iphone;

        musicPlayer.selecionarMuscia();
        musicPlayer.tocar();
        musicPlayer.pausar();

//        opera.exibirPagina();
//        opera.atualizarPagina();
//        opera.adcionarNovaAba();

//        telefone.ligar();
//        telefone.Atender();
//        telefone.IniciarCorreioVoz();
    }
}