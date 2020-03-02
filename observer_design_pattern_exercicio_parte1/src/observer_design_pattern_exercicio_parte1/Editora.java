package observer_design_pattern_exercicio_parte1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Editora implements Subject {
	private Entregavel e = new Entregavel();
	private List <Observer> observers = new ArrayList<>();
	private int dia;
	
	
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
        observers.remove(o);

	}

	@Override
	public void notifyObserver() {
		List<Observer> aux = new ArrayList<>();
        
		for(Observer o: observers) {
        	if(((Pessoa)o).getConteudo() == "Estadao") {
        		if(((Pessoa)o).getTipoAssinatura() == "Semanal"){
        			if(dia == 7 || dia == 1) {
        				e.setConteudo("Estadão Semanal");
        				o.update(e);			
        			}
        		}
        		
        		else{
        			e.setConteudo("Estadão Diario");
    				o.update(e);
        		}
        	}
        	
        	else {
        		if(dia == 7 || dia == 1) {
        			e.setConteudo("Marie Claire Semanal");
    				o.update(e);
    			}
        	}
        	
        	if(((Pessoa)o).getAssinaturaAtiva()){
        		aux.add(o);
        	}	
        }
    	observers.clear();
		observers.addAll(aux);

	}
	
	public void iniciar() {
		Calendar rightNow = Calendar.getInstance();
        dia = rightNow.get(Calendar.DAY_OF_WEEK);
		while(true) {
	        notifyObserver();
	        System.out.println("=====================================================");
	        dia++;
	        if(dia == 8) {
	        	dia = 1;
	        }
	        if(observers.isEmpty()) {
	        	System.out.println("falimos!!");
	        	break;
	        }
		}

	}

}
