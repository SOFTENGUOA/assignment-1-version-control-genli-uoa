package se283.a1.t3;

public abstract class Job {
    // Calculates the energy-consumption cost.
    protected double jobRent(Floor floor, Machine machine) {
        double electricityPerUnitArea = floor.getCondition()*machine.getCapability();
        double energyConsumption = electricityPerUnitArea*floor.getArea();
        return energyConsumption*machine.getCostPerUnitElectricity();
    }
}
