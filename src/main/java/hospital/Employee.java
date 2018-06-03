package hospital;

public abstract class Employee {

	protected String empNumber;
	protected String empName;

	public String getEmpNumber() {
		return empNumber;
	}

	public String getEmpName() {
		return empName;
	}

	// want to remove specific number, so removed functionality and made paySalary
	// abstract. That drove Employee to be made abstract. Then removed constructor,
	// because an Abstract Class cannot have an Object (we are not going to create
	// objects of type employee - are going to make more specific Objects, like Dr,
	// nurse, receptionist

	public abstract String paySalary();

}