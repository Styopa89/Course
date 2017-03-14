package lesson9.observerJurnal.jdkone;

import java.util.Observable;
import java.util.Observer;

public class Supervisor implements Observer {
	

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof ActionEvent) {
			System.out.println(this.toString() + " notified. Event " + ((ActionEvent) arg).getName());
		} else {
			System.out.println(this.toString() + " notified.");
		}
		Worker w = (Worker) o;
		System.out.println("Job Result: " + w.getJobResult());
	}
}
