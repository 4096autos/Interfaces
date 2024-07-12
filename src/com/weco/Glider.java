package com.weco;

public class Glider extends Vehicule {
    public Glider() {
	this.aMovementSpeed = 28;
    }

    public void moveXY(int x, int y) {
	System.out.println("Le palneuur fend l'air vers  " + x + " , " + y);
    }
}