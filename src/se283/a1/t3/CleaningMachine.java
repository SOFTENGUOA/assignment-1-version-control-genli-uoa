package se283.a1.t3;

/**
 * It represents a cleaning machine.
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: 20/08/2021
 *
 * - Extended the class from abstract-class Machine: it's for polymorphism.
 * - Renamed method costPerUnitElectricity to getCostPerUnitElectricity; it's for method-name consistency.
 * - Moved comments inside the methods to abstract-class Machine: it's for comment minimisation.
 * - Removed empty lines: they're non-essential.
 * - Added @Override annotations to methods getCapability and getCostPerUnitElectricity; it's a style preference.
 *
 * Note: You may create new classes, methods or fields in this package
 *
 */
public class CleaningMachine extends Machine {
    @Override
	public int getCapability() {
		return 65; 
	}

    @Override
	public double getCostPerUnitElectricity() {
		return 4.0;
	}
}
