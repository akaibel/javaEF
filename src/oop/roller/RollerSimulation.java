package oop.roller;

public class RollerSimulation {
	public static void main(String[] args) {
		Tankstelle t = new Tankstelle(1.23);

		Roller r1 = new Roller(8.0, 3.2);
		Fahrer f1 = new Fahrer("Paul", 5);
		f1.setRoller(r1);
		f1.setTankstelle(t);
		
		Roller r2 = new Roller(7.5, 2.8);
		Fahrer f2 = new Fahrer("Martin", 10);
		f2.setRoller(r2);
		f2.setTankstelle(t);
	}
}
