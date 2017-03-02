package lesson9.observer;

public interface Subject {

	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
