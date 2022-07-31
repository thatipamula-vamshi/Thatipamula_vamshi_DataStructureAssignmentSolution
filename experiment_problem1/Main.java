package com.experiment_problem1;

public class Main {

	public static int totalFloors;
	public static int[] totalFloorSize;

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.getInputs();
		driver.calculateAndPrintOrderOfConstruction(driver.totalFloorSize);
	}
}
