package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DoctorTest {
	// when create Object, include space for instance variables, in this case, 3
	Doctor underTest = new Doctor("1", "name", "area"); // this was the first thing created on page
	Patient patient = new Patient();// this was created first under a test and them moved here so could be re-used

	// test on state verification (variables) (ie behavior = methods)
	@Test
	public void shouldBeAbleToDrawBlood() {
		// Patient patient = new Patient(); - created here, but later moved to top so we
		// could re-use it with later tests.
		// driving the creation of Patient Class
		// think about blood level before and after draw
		// create an accessor in the patient Class
		int bloodLevelBefore = patient.getBloodLevel();
		// Doctor is the undertest object
		underTest.drawBlood(patient);
		// need to know blood after draw
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5));
	}

	@Test
	public void shouldBeAbleToIncreasePatientHealthLevelWithCare() {

		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String check = underTest.getEmpNumber();
		assertEquals(check, "1");
	}

	@Test
	public void shouldReturnEmpName() {
		String check = underTest.getEmpName();
		assertEquals(check, "name");
	}

	@Test
	public void shouldReturnSpecialty() {
		String check = underTest.getSpecialty();
		assertEquals(check, "area");
	}
	
	@Test
	public void shouldGetPaid90K() {
		String check = underTest.paySalary();
		assertEquals(check, "90000");
	}
}
