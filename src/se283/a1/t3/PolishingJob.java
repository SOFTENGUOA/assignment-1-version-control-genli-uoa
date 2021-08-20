package se283.a1.t3;

/**
 * It represents a polishing job.
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: 20/08/2021
 * 
 * - Extended the class from abstract-class Job; it minimises code.
 * - Moved the logic inside method polishingRent to method jobRent of abstract-class Job, and added an invocation of method jobRent of the abstract class to method polishingRent: it's for code minimisation.
 * - Removed empty lines: they're non-essential.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */
public class PolishingJob extends Job {
	double polishingRent(Floor floor, PolishingMachine polisher) {
        return jobRent(floor, polisher);
	}
}
