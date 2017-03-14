package lesson9.observerJurnal.jdkone;

import java.util.Observable;

public class Worker extends Observable {
	
	private double jobResult = 0;
	
	public Worker() {
	}
	
	public void doRegularJob() {
		double d = Math.random();
		if (d < 0.5 || d > 10.0) {
			System.out.println("Regular Job done!");
			jobResult = d;
			setChanged();
			notifyObservers();
		} else {
			System.out.println("Regular Job failed!");
		}
	}

	public void doSpecificJob() {
		double d = Math.random();
		if (d < 0.5 || d > 10.0) {
			System.out.println("Specific Job done!");
			jobResult = d;
			setChanged();
			notifyObservers(new ActionEvent(null));
		} else {
			System.out.println("Specific Job failed!");
		}
	}
	
	public double getJobResult() {
		return jobResult;
	}
}
