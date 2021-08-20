package se283.a1.t3;

/**
 * It represents a floor.
 * 
 * @author Author Name: [YOUR NAME] Author UPI: [YOUR UPI]
 * @version Date: 20/08/2021
 *
 * - Removed comments inside methods length and width: they're non-essential.
 * - Renamed methods length and width to getLength and getWidth respectively: it's for method-name consistency.
 * - Added method getArea: it's likely that it'll be useful.
 * - Removed empty lines: they're non-essential.
 * 
 * Note: You may create new classes, methods or fields in this package
 *
 */
public class Floor {
	public int getLength() {
		return 21;
	}

	public int getWidth() {
		return 45;
	}

    public int getArea() {
        return getLength()*getWidth();
    }

	public int getCondition() {
		// Current condition of the floor rated on the scale of 1 (worst) to 10 (best)
		return 5;
	}
}
