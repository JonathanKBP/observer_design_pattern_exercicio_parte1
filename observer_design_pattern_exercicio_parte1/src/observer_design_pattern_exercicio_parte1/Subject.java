package observer_design_pattern_exercicio_parte1;

public interface Subject {
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	
}
