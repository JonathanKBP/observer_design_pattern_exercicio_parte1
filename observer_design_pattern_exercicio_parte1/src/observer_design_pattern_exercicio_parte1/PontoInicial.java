package observer_design_pattern_exercicio_parte1;

public class PontoInicial {
	 public static void main(String[] args) {
	        Editora editora = new Editora();
	        editora.addObserver(new Pessoa("Jose", "Estadao", "Diario"));
	        editora.addObserver(new Pessoa("Joao", "Estadao", "Semanal"));
	        editora.addObserver(new Pessoa("Maria", "Marie Claire", "Semanal"));
	        editora.iniciar();

	    }
}
