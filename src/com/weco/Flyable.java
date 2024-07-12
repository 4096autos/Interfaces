package com.weco;

//@FunctionalInterface
interface Flyable {
    // public final int flySpeed = 20;
    public void fly(String energy);

    default public void test() {
	System.out.println("Test");
    }
}