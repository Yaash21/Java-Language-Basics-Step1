package org.stackroute;

public class Practice1 {
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 200.2;
	boolean isTheCarOn = false;
	char condition = 'A';
	
	public void print(){
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
	}
	public void wreck(){
		condition = 'C';
		maxSpeed = 60;
	}
	public static void main(String[] args) {
	
		Practice1 car = new Practice1();
		car.print();
		Practice1 aliceCar = car;
		car.wreck();
		aliceCar.print();

	}

}
