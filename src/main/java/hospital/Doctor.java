package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	// Constructor
	public Doctor(String empNumber, String empName, String specialty) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.specialty = specialty;
	}

	// Methods of Behavior

	@Override // indicates has been changed and comes from somewhere else
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.recieveHealth(5);

	}

	@Override
	public String paySalary() {
		return "90000";
	}

}
