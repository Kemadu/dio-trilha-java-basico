package iphone.iphone;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("TOCANDO VIA IPHONE");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO VIA IPHONE");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA VIA IPHONE");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA VIA IPHONE");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA VIA IPHONE");
		
	}

	@Override
	public void ligar() {
		System.out.println("LIGANDO VIA IPHONE");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDENDO VIA IPHONE");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");
		
	}

}

