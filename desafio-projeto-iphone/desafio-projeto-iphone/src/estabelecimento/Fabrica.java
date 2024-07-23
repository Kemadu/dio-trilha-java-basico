package estabelecimento;

import iphone.iphone.Iphone;

public class Fabrica {
	public static void main(String[] args) {
		Iphone iph = new Iphone();
		
		iph.ligar();
		iph.atender();
		iph.iniciarCorreioVoz();
		iph.exibirPagina();
		iph.atualizarPagina();
		iph.adicionarNovaAba();
		iph.tocar();
		iph.pausar();
		iph.selecionarMusica();
	}
}