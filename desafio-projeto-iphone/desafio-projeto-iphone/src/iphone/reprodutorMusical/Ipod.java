package iphone.reprodutorMusical;

public class Ipod implements ReprodutorMusical{
	public void tocar() {
		System.out.println("TOCANDO");
	}
	
	public void pausar() {
		System.out.println("PAUSANDO");
	}
	
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
	}
}
