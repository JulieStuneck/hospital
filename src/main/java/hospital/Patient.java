package hospital;

public class Patient {

	// **Organization** - Constants (properties)
	private static final int DEFAULT_HEALTH_LEVEL = 10;
	private static final int DEFAULT_BLOOD_LEVEL = 20;
	// to create constant value - set int default first (20), then highlight number,
	// rt-click, refactor, extract constant, name of constant should be all caps
	// with _ between words (keep private in Instance Variable).

	// **Organization** - Private Fields (properties)
	private int bloodLevel = DEFAULT_BLOOD_LEVEL;
	private int healthLevel = DEFAULT_HEALTH_LEVEL;

	// **Organization** - Accessors

	public int getBloodLevel() {
		// started with return statement, which drove creation of field (above)
		return bloodLevel;
	}

	public int getHealthLevel() {// getHealth created lower and moved here to be with other accessors
		return healthLevel;
	}

	// **Organization** - methods of behavior
	//these are tied to the Doctor's methods

	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}

	public void recieveHealth(int amount) {
		healthLevel += amount;
	}

}