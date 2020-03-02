package observer_design_pattern_exercicio_parte1;

import java.util.Random;

public class Pessoa implements Observer {
	
	private String nome;
	private String conteudo;
	private String tipoAssinatura;
	private boolean assinaturaAtiva = true;
	 private Random gerador = new Random ();
	@Override
	public void update(Entregavel entregavel) {
		System.out.println(nome + ": " + "recebi " + entregavel.getConteudo());
		assinaturaAtiva = gerador.nextDouble() <= 0.1;

	}
	public Pessoa(String nome, String conteudo, String tipoAssinatura) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.tipoAssinatura = tipoAssinatura;
    }
	
	public boolean getAssinaturaAtiva () {
		return this.assinaturaAtiva;
	}
	    
	public String getTipoAssinatura(){
	    return this.tipoAssinatura;
	 }
	public String getConteudo(){
	    return this.conteudo;
	 } 

}
