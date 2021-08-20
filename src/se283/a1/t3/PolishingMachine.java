package se283.a1.t3;

/**
 * It describes a polishing machine.
 *
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: 20/08/2021
 * 
 * - Extended the class from abstract-class Machine: it's for polymorphism.
 * - Renamed method costPerUnitElectricity to getCostPerUnitElectricity; it's for method-name consistency.
 * - Moved comments inside the methods to abstract-class Machine: it's for comment minimisation.
 * - Removed empty lines: they're non-essential.
 *
 * Note: You may create new classes, methods or fields in this package
 *
 */
public class PolishingMachine extends Machine {
	public int getCapability() {
		return 82; 
	}

	public double getCostPerUnitElectricity() {
		return 4.5;
	}
}
