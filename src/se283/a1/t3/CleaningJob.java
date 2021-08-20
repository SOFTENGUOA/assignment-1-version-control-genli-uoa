package se283.a1.t3;

/**
 * It represents a cleaning job.
 *
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: 20/08/2021
 *
 * - Extended the class from abstract-class Job; it minimises code.
 * - Moved the logic inside method cleaningRent to method jobRent of abstract-class Job, and added an invocation of method jobRent of the abstract class to method polishingRent: it's for code minimisation.
 * - Moved the comment on method cleaningRent to method jobRent of abstract-class Job; the comment and the latter method are more coherent.
 * - Removed empty lines: they're non-essential.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */
public class CleaningJob extends Job {
	double cleaningRent(Floor floor, CleaningMachine cleaner) {
        return jobRent(floor, cleaner);
	}	
}
