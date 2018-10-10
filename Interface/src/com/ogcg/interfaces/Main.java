package com.ogcg.interfaces;

public class Main {

	public static void processLiving(LivingBeing being) {
		being.eat();
		being.move();
	}
	
	public static void processCute(CuteThing thing) {
		thing.beCute();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuqueue t = new Tuqueue();
		Cockroach c = new Cockroach();
		processLiving(t);
		processCute(t);
		processLiving(c);
	}

}
